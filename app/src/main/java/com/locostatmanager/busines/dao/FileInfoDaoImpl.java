package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.FileInfo;
import com.locostatmanager.busines.exceptions.DataAccessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author dmitry
 */
public class FileInfoDaoImpl extends JdbcDaoSupport implements FileInfoDao {

    public FileInfo get(String fileName, Integer fileSize) throws DataAccessException {
        try {
            return getJdbcTemplate().queryForObject("SELECT * FROM FILE_INFO WHERE FILE_NAME = ? AND FILE_SIZE = ?", new Object[]{fileName, fileSize}, new FileInfoMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    private class FileInfoMapper implements RowMapper<FileInfo> {

        public FileInfo mapRow(ResultSet rs, int i) throws SQLException {
            FileInfo fileInfo = new FileInfo();
            fileInfo.setFileName(rs.getString("FILE_NAME"));
            fileInfo.setFileSize(rs.getInt("FILE_SIZE"));
            fileInfo.setLoadingDate(rs.getTimestamp("LOADING_DATE"));
            return fileInfo;
        }
    }
}
