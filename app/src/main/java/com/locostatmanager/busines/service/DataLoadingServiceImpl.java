package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.DataDao;
import com.locostatmanager.busines.dao.FileStructureInfoDao;
import com.locostatmanager.busines.dao.RecordStructureInfoDao;
import com.locostatmanager.busines.dao.entities.FileStructureInfo;
import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.RecordStructureInfo;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dmitry
 */
@Service
public class DataLoadingServiceImpl implements DataLoadingService {

    @Autowired
    private FileStructureInfoDao fileStructureInfoDao;
    @Autowired
    private RecordStructureInfoDao recordStructureInfoDao;
    @Autowired
    private DataDao dataDao;

    @Override
    @Transactional
    public void loadData(byte[] file, String type) throws Exception {

        FileStructureInfo fileStructureInfo = fileStructureInfoDao.get(type);
        List<byte[]> recors = getRecordsFromFile(file, fileStructureInfo);
        List<RecordStructureInfo> recordsInfo = recordStructureInfoDao.getByFsiType(fileStructureInfo.getType());
        List<Map<String, Double>> values = getValuesFromRecords(recordsInfo, recors);
        List<LocoDataEntity> entitys = createEntities(values);
        long i = 10;
        for (LocoDataEntity entity : entitys) {
            
            try {
                dataDao.add(entity);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private List<byte[]> getRecordsFromFile(byte[] file, FileStructureInfo fileStructureInfo) {

        List<byte[]> records = new ArrayList<byte[]>();

        int cursor = fileStructureInfo.getRecordsStartIndex();

        while (cursor < file.length) {
            byte[] record = Arrays.copyOfRange(file, cursor, cursor + fileStructureInfo.getRecordLength());
            records.add(record);
            cursor += fileStructureInfo.getRecordLength();
        }

        return records;
    }

    private List<Map<String, Double>> getValuesFromRecords(List<RecordStructureInfo> recordsInfo, List<byte[]> records) {

        List<Map<String, Double>> values = new ArrayList<Map<String, Double>>();
        for (byte[] record : records) {

            Map<String, Double> value = new HashMap<String, Double>();
            for (RecordStructureInfo recordStructureInfo : recordsInfo) {

                Byte val = record[recordStructureInfo.getIndex()];
                value.put(recordStructureInfo.getName().replace(" ", ""), val.doubleValue() * recordStructureInfo.getDelta());
                values.add(value);
            }
        }
        return values;
    }

    private List<LocoDataEntity> createEntities(List<Map<String, Double>> values) throws IOException {

        List<LocoDataEntity> entitys = new ArrayList<LocoDataEntity>();
        for (Map<String, Double> value : values) {
            ObjectMapper mapper = new ObjectMapper();
            String jsonEntity = mapper.writeValueAsString(value);
            LocoDataEntity entity = mapper.readValue(jsonEntity, LocoDataEntity.class);
            entity.setIdLoco("L001dp");
            entity.setRecordTimeLocoData(new Timestamp(Calendar.getInstance().getTimeInMillis()));
            entitys.add(entity);
        }
        return entitys;
    }
}
