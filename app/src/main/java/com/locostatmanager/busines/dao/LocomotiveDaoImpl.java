package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.LocoEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by anatoliy on 23.04.14.
 */
public class LocomotiveDaoImpl extends JdbcDaoSupport implements LocomotiveDao {

    @Override
    public void add(LocoEntity entity) {

        getJdbcTemplate().update("INSERT INTO LOCO (ID_LOCO, TITLE_LOCO) VALUES (?,?)",
                new Object[]{entity.getIdLoco(), entity.getTitleLoco()});
    }

    @Override
    public List<LocoEntity> getAll() {

        return getJdbcTemplate().query("SELECT * FROM LOCO", new LocoRowMapper());
    }

    @Override
    public LocoEntity getById(String id) {
        return getJdbcTemplate().queryForObject("SELECT * FROM LOCO WHERE ID_LOCO = ?", new Object[]{id}, new LocoRowMapper());
    }

    @Override
    public LocoEntity getByTitle(String title) {
        return getJdbcTemplate().queryForObject("SELECT * FROM LOCO WHERE TITLE_LOCO = ?", new Object[]{title}, new LocoRowMapper());
    }

    private class LocoRowMapper implements RowMapper<LocoEntity> {

        public LocoEntity mapRow(ResultSet rs, int i) throws SQLException {
            
            LocoEntity locoEntity = new LocoEntity();
            locoEntity.setIdLoco(rs.getString("ID_LOCO"));
            locoEntity.setTitleLoco(rs.getString("TITLE_LOCO"));
            return locoEntity;
        }
    }
}
