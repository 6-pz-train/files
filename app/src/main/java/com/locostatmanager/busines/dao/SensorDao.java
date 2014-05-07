package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.SensorEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface SensorDao {
    
    void add(SensorEntity entity) throws DataAccessException;
    List<SensorEntity> getAll() throws DataAccessException;
    SensorEntity getByName(String name) throws DataAccessException;
    String getCount() throws DataAccessException;
}
