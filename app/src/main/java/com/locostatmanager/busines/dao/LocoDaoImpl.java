package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.LocoDao;
import com.locostatmanager.busines.dao.entities.SensorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by anatoliy on 23.04.14.
 */

public class LocoDaoImpl extends JdbcDaoSupport implements LocoDao {

    public void addSensor(SensorEntity entity) {
        getJdbcTemplate().update("insert into sql337514.Sensor (NAME, DESCRIPTION, UNIT_OF_MEASURE) values (?,?,?)",
                new Object[]{entity.getName(), entity.getDescription(), entity.getUnitOfMeasure()} );
    }

    public List<SensorEntity> getAllSensors() {
        return getJdbcTemplate().queryForList("select * from sql337514.Sensor", SensorEntity.class);
    }
}
