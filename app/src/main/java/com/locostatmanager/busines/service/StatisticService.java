package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.message.LocomotiveStatistic;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface StatisticService {

    void add(LocoDataEntity entity) throws DataAccessException, ValidationException;
    List<LocoDataEntity> getAll() throws DataAccessException, ValidationException;
    List<LocoDataEntity> getAfter(Timestamp date) throws DataAccessException, ValidationException;
    List<LocoDataEntity> getBefore(Timestamp date) throws DataAccessException, ValidationException;
    List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate) throws DataAccessException, ValidationException;
    List<LocoDataEntity> getAfter(Timestamp date, LocoEntity entity) throws DataAccessException, ValidationException;
    List<LocoDataEntity> getBefore(Timestamp date, LocoEntity entity) throws DataAccessException, ValidationException;
    List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate, LocoEntity entity) throws DataAccessException, ValidationException;
    List<LocoDataEntity> getBetween(String startDate, String endDate, String locomotiveId) throws DataAccessException, ValidationException;
    List<LocoDataEntity> getByLocomotive(LocoEntity entity) throws DataAccessException, ValidationException;
    LocoDataEntity getById(String id) throws DataAccessException, ValidationException;
    String getCount() throws DataAccessException, ValidationException;
    List<LocomotiveStatistic> getLocomotivesRatio() throws DataAccessException, ValidationException;
    List<LocomotiveStatistic> getLocomotivesPercentage() throws DataAccessException, ValidationException;
}
