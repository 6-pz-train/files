package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.DataDao;
import com.locostatmanager.busines.dao.LocomotiveDao;
import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import java.sql.Timestamp;
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

}
