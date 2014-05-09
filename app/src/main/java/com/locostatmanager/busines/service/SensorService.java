package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.entities.SensorEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface SensorService {

    void add(SensorEntity entity) throws DataAccessException, ValidationException;
    List<SensorEntity> getAll() throws DataAccessException, ValidationException;
    SensorEntity getByName(String name) throws DataAccessException, ValidationException;
    String getCount() throws DataAccessException, ValidationException;
    List<SensorEntity> getBuks() throws DataAccessException, ValidationException;
    List<SensorEntity> getOsnovn() throws DataAccessException, ValidationException;
    List<SensorEntity> getPTres() throws DataAccessException, ValidationException;
    List<SensorEntity> getTDvig() throws DataAccessException, ValidationException;
}
