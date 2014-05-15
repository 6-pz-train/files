package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.DataDao;
import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.message.LocomotiveStatistic;

import java.sql.Time;
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
    public List<LocoDataEntity> getByLocomotive(LocoEntity entity) throws DataAccessException, ValidationException {

        return dataDao.getByLocomotive(entity);
    }

    @Transactional
    public LocoDataEntity getById(String id) throws DataAccessException, ValidationException {
        return dataDao.getById(id);
    }

    public List<LocoDataEntity> getBetween(String startDate, String endDate, String locomotiveId) throws DataAccessException, ValidationException {

        Timestamp start = null;
        Timestamp end = null;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
            start = new Timestamp(dateFormat.parse(startDate).getTime());
            end = new Timestamp(dateFormat.parse(endDate).getTime());
        } catch (ParseException e) {
            throw new ValidationException(e);
        }

        if (null == locomotiveId || "".equals(locomotiveId)) {
            throw new ValidationException(new Exception("not valid locomotive id"));
        }
        return dataDao.getBetween(start, end, locomotiveId);
    }

    public int getCount() throws DataAccessException, ValidationException {
        return dataDao.getCount();
    }

    @Transactional
    public List<LocomotiveStatistic> getLocomotivesRatio() throws ValidationException, DataAccessException {

        List<LocomotiveStatistic> statistics = new ArrayList<LocomotiveStatistic>();
        List<LocoEntity> list = locomotiveService.getAll();

        for (LocoEntity entity : list) {
            LocomotiveStatistic ls = new LocomotiveStatistic();
            ls.setLocoName(entity.getIdLoco());
            ls.setLocoPortion(dataDao.getRecordsCount(entity.getIdLoco()));
            statistics.add(ls);
        }
        return statistics;
    }

    @Transactional
    public List<LocomotiveStatistic> getLocomotivesPercentage() throws ValidationException, DataAccessException {

        List<LocomotiveStatistic> statistics = new ArrayList<LocomotiveStatistic>();
        List<LocoEntity> list = locomotiveService.getAll();
        int allRecordsCount = dataDao.getCount();

        for (LocoEntity entity : list) {
            LocomotiveStatistic ls = new LocomotiveStatistic();
            ls.setLocoName(entity.getIdLoco());
            ls.setLocoPortion( 100.00 * dataDao.getRecordsCount(entity.getIdLoco()) / allRecordsCount);
            statistics.add(ls);
        }
        return statistics;
    }
}
