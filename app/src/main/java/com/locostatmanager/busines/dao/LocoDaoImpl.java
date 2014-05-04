package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.dao.entities.SensorEntity;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import java.util.List;

/**
 * Created by anatoliy on 23.04.14.
 */

public class LocoDaoImpl extends JdbcDaoSupport implements LocoDao {

//    public void addSensor(SensorEntity entity) {
//        getJdbcTemplate().update("insert into sql337514.Sensor (NAME, DESCRIPTION, UNIT_OF_MEASURE) values (?,?,?)",
//                new Object[]{entity.getName(), entity.getDescription(), entity.getUnitOfMeasure()} );
//    }
//
//    public List<SensorEntity> getAllSensors() {
//        return getJdbcTemplate().queryForList("select * from sql337514.Sensor", SensorEntity.class);
//    }

    public void addLoco(LocoEntity entity) {
        getJdbcTemplate().update("insert into LOCO (ID_LOCO, TITLE_LOCO) values (?,?)",
                new Object[]{entity.getIdLoco(), entity.getTitleLoco()} );
        
    }

    public List<LocoEntity> getAllLoco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
