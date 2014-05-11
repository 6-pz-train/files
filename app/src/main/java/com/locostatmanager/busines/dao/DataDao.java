package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface DataDao {
    
    void add(LocoDataEntity entity) throws DataAccessException;
    List<LocoDataEntity> getAll() throws DataAccessException;
    List<LocoDataEntity> getAfter(Timestamp date) throws DataAccessException;
    List<LocoDataEntity> getBefore(Timestamp date) throws DataAccessException;
    List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate) throws DataAccessException;
    List<LocoDataEntity> getAfter(Timestamp date, LocoEntity entity) throws DataAccessException;
    List<LocoDataEntity> getBefore(Timestamp date, LocoEntity entity) throws DataAccessException;
    List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate, LocoEntity entity) throws DataAccessException;
    List<LocoDataEntity> getBetween(String startDate, String endDate, String locomotiveId) throws DataAccessException;
    List<LocoDataEntity> getByLocomotive(LocoEntity entity) throws DataAccessException;
    LocoDataEntity getById(String id) throws DataAccessException;
    String getCount() throws DataAccessException;
    String getRecordsCount(String LocoId) throws DataAccessException;
}
