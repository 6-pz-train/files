package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.FileInfo;
import com.locostatmanager.busines.exceptions.DataAccessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import org.springframework.dao.EmptyResultDataAccessException;
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
        } catch (EmptyResultDataAccessException e) {
            return null;
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public void add(FileInfo fileInfo) throws DataAccessException {
        try {
            getJdbcTemplate().update("INSERT INTO FILE_INFO (FILE_NAME, FILE_SIZE, LOADING_DATE) VALUES (?, ?, ?)",
                    new Object[]{fileInfo.getFileName(), fileInfo.getFileSize(), new Timestamp(Calendar.getInstance().getTimeInMillis())});
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
