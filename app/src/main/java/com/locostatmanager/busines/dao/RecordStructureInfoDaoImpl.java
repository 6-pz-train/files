package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.RecordStructureInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author dmitry
 */
public class RecordStructureInfoDaoImpl extends JdbcDaoSupport implements RecordStructureInfoDao {

    public List<RecordStructureInfo> getByFsiId(String fsiId) {
        return getJdbcTemplate().query("SELECT * FROM RECORD_STRUCTURE_INFO WHERE FSI_ID = ?", new Object[]{fsiId}, new RecordStructureInfoMapper());
    }
    
    private class RecordStructureInfoMapper implements RowMapper<RecordStructureInfo>{

        public RecordStructureInfo mapRow(ResultSet rs, int i) throws SQLException {
            
            RecordStructureInfo recordStructureInfo = new RecordStructureInfo();
            recordStructureInfo.setFsiId(rs.getInt("FSI_ID"));
            recordStructureInfo.setName(rs.getString("NAME"));
            recordStructureInfo.setIndex(rs.getInt("INDEx"));
            recordStructureInfo.setDelta(rs.getDouble("DELTA"));
            return recordStructureInfo;
        } 
    }
}
