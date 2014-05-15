package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.SensorEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
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
    public void add(SensorEntity entity) throws DataAccessException {

        try {
            getJdbcTemplate().update("INSERT INTO SENSOR (NAME, DESCRIPTION, UNIT_OF_MEASURE) VALUES (?,?,?)",
                    new Object[]{entity.getName(), entity.getDescription(), entity.getUnitOfMeasure()});
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<SensorEntity> getAll() throws DataAccessException {
        try {
            return getJdbcTemplate().query("SELECT * FROM SENSOR", new SensorRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public SensorEntity getByName(String name) throws DataAccessException {
        try {
            return getJdbcTemplate().queryForObject("SELECT * FROM SENSOR WHERE NAME = ?", new Object[]{name}, new SensorRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public String getCount() throws DataAccessException {
        try {
            return getJdbcTemplate().queryForObject("SELECT COUNT(*) FROM SENSOR", String.class);
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public List<SensorEntity> getByUnitName(String unitName) throws DataAccessException {
        try {
            return getJdbcTemplate().query("SELECT * FROM SENSOR WHERE UNIT_NAME = ?",new Object[] {unitName}, new SensorRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    private class SensorRowMapper implements RowMapper<SensorEntity> {

        public SensorEntity mapRow(ResultSet rs, int i) throws SQLException {

            SensorEntity sensorEntity = new SensorEntity();
            sensorEntity.setName(trim(rs.getString("NAME")));
            sensorEntity.setDescription(trim(rs.getString("DESCRIPTION")));
            sensorEntity.setUnitOfMeasure(trim(rs.getString("UNIT_OF_MEASURE")));
            return sensorEntity;
        }
    }

    private String trim(String str){
        return str == null ? null : str.trim();
    }
}
