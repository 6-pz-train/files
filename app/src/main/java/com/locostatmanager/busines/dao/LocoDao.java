package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.SensorEntity;

import java.util.List;

/**
 * Created by anatoliy on 23.04.14.
 */
public interface LocoDao {
    void addSensor(SensorEntity entity);
    List<SensorEntity> getAllSensors();
}
