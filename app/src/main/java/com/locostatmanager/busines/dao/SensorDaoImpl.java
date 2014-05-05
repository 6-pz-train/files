package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.SensorEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author dmitry
 */
public class SensorDaoImpl extends JdbcDaoSupport implements SensorDao {

    @Override
    public void add(SensorEntity entity) {
        getJdbcTemplate().update("INSERT INTO SENSOR (NAME, DESCRIPTION, UNIT_OF_MEASURE) VALUES (?,?,?)",
                new Object[]{entity.getName(), entity.getDescription(), entity.getUnitOfMeasure()});
    }

    @Override
    public List<SensorEntity> getAll() {
        return getJdbcTemplate().query("SELECT * FROM SENSOR", new SensorRowMapper());
    }

    @Override
    public SensorEntity getByName(String name) {
        return getJdbcTemplate().queryForObject("SELECT * FROM SENSOR WHERE NAME = ?", new Object[]{name}, new SensorRowMapper());
    }

    private class SensorRowMapper implements RowMapper<SensorEntity> {

        public SensorEntity mapRow(ResultSet rs, int i) throws SQLException {

            SensorEntity sensorEntity = new SensorEntity();
            sensorEntity.setName(rs.getString("NAME"));
            sensorEntity.setDescription(rs.getString("DESCRIPTION"));
            sensorEntity.setUnitOfMeasure(rs.getString("UNIT_OF_MEASURE"));
            return sensorEntity;
        }
    }
}
