package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.FileStructureInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author dmitry
 */
public class FileStructureInfoDaoImpl extends JdbcDaoSupport implements FileStructureInfoDao {

    public FileStructureInfo get() {
        
        return getJdbcTemplate().queryForObject("SELECT * FROM FILE_STRUCTURE_INFO", new FileStructureInfoMapper());
    }
    
    private class FileStructureInfoMapper implements RowMapper<FileStructureInfo> {

        public FileStructureInfo mapRow(ResultSet rs, int i) throws SQLException {
            FileStructureInfo fileStructureInfo = new FileStructureInfo();
            fileStructureInfo.setId(rs.getLong("ID"));
            fileStructureInfo.setRecordLength(rs.getInt("RECORD_LENGTH"));
            fileStructureInfo.setRecordsStartIndex(rs.getInt("RECORD_START_INDEX"));
            return fileStructureInfo;
        }
        
    } 
}
