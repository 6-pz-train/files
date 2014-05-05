package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface DataDao {
    
    void add(LocoDataEntity entity);
    List<LocoDataEntity> getAll();
    List<LocoDataEntity> getAfter(Timestamp date);
    List<LocoDataEntity> getBefore(Timestamp date);
    List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate);
    List<LocoDataEntity> getAfter(Timestamp date, LocoEntity entity);
    List<LocoDataEntity> getBefore(Timestamp date, LocoEntity entity);
    List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate, LocoEntity entity);
    List<LocoDataEntity> getByLocomotive(LocoEntity entity);
    LocoDataEntity getById(String id);
}
