package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.FileStructureInfo;
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
public class FileStructureInfoDaoImpl extends JdbcDaoSupport implements FileStructureInfoDao {

    public FileStructureInfo get() {

        return getJdbcTemplate().queryForObject("SELECT * FROM FILE_STRUCTURE_INFO", new FileStructureInfoMapper());
    }

    public List<FileStructureInfo> getAll() throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM FILE_STRUCTURE_INFO", new FileStructureInfoMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    private class FileStructureInfoMapper implements RowMapper<FileStructureInfo> {

        public FileStructureInfo mapRow(ResultSet rs, int i) throws SQLException {
            FileStructureInfo fileStructureInfo = new FileStructureInfo();
            fileStructureInfo.setId(rs.getLong("ID"));
            fileStructureInfo.setRecordLength(rs.getInt("RECORD_LENGTH"));
            fileStructureInfo.setRecordsStartIndex(rs.getInt("RECORD_START_INDEX"));
            fileStructureInfo.setType(rs.getString("TYPE"));
            return fileStructureInfo;
        }

    }
}
