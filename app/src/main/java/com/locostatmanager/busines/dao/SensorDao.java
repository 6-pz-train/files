package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.SensorEntity;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface SensorDao {
    
    void add(SensorEntity entity);
    List<SensorEntity> getAll();
    SensorEntity getByName(String name);
}
