package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.DataDao;
import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.message.LocomotiveStatistic;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dmitry
 */
@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private DataDao dataDao;
    @Autowired
    private LocomotiveService locomotiveService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void add(LocoDataEntity entity) throws DataAccessException, ValidationException {

        dataDao.add(entity);
    }

    @Transactional
    public List<LocoDataEntity> getAll() throws DataAccessException, ValidationException {

        return dataDao.getAll();
    }

    @Transactional
    public List<LocoDataEntity> getAfter(Timestamp date) throws DataAccessException, ValidationException {

        return dataDao.getAfter(date);
    }

    @Transactional
    public List<LocoDataEntity> getBefore(Timestamp date) throws DataAccessException, ValidationException {

        return dataDao.getBefore(date);
    }

    @Transactional
    public List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate) throws DataAccessException, ValidationException {

        return dataDao.getBetween(startDate, endDate);
    }

    @Transactional
    public List<LocoDataEntity> getAfter(Timestamp date, LocoEntity entity) throws DataAccessException, ValidationException {

        return dataDao.getAfter(date, entity);
    }

    @Transactional
    public List<LocoDataEntity> getBefore(Timestamp date, LocoEntity entity) throws DataAccessException, ValidationException {

        return dataDao.getBefore(date, entity);
    }

    @Transactional
    public List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate, LocoEntity entity) throws DataAccessException, ValidationException {

        return dataDao.getBetween(startDate, endDate, entity);
    }

    @Transactional
    public List<LocoDataEntity> getByLocomotive(LocoEntity entity) throws DataAccessException, ValidationException {

        return dataDao.getByLocomotive(entity);
    }

    @Transactional
    public LocoDataEntity getById(String id) throws DataAccessException, ValidationException {
        return dataDao.getById(id);
    }

    public List<LocoDataEntity> getBetween(String startDate, String endDate, String locomotiveId) throws DataAccessException, ValidationException {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
            dateFormat.parse(startDate);
            dateFormat.parse(endDate);
        } catch (ParseException e) {
            throw new ValidationException(e);
        }

        if (null == locomotiveId || "".equals(locomotiveId)) {
            throw new ValidationException(new Exception("not valid locomotive id"));
        }
        return dataDao.getBetween(startDate, endDate, locomotiveId);
    }

    public String getCount() throws DataAccessException, ValidationException {
        return dataDao.getCount();
    }

    @Transactional
    public List<LocomotiveStatistic> getLocomotivesRatio() throws ValidationException, DataAccessException {

        List<LocomotiveStatistic> statistics = new ArrayList<LocomotiveStatistic>();
        List<LocoEntity> list = locomotiveService.getAll();

        for (LocoEntity entity : list) {
            LocomotiveStatistic ls = new LocomotiveStatistic();
            ls.setLocoName(entity.getTitleLoco());
            ls.setLocoPortion(dataDao.getRecordsCount(entity.getIdLoco()));
            statistics.add(ls);
        }
        return statistics;
    }

    @Transactional
    public List<LocomotiveStatistic> getLocomotivesPercentage() throws ValidationException, DataAccessException {

        List<LocomotiveStatistic> statistics = new ArrayList<LocomotiveStatistic>();
        List<LocoEntity> list = locomotiveService.getAll();
        Integer recordsCount = new Integer(dataDao.getCount()) / 100;

        for (LocoEntity entity : list) {
            LocomotiveStatistic ls = new LocomotiveStatistic();
            ls.setLocoName(entity.getTitleLoco());
            ls.setLocoPortion(String.valueOf(recordsCount * new Integer(dataDao.getRecordsCount(entity.getIdLoco()))));
            statistics.add(ls);
        }
        return statistics;
    }
}
