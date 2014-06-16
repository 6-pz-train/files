package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.FileInfo;
import com.locostatmanager.busines.exceptions.DataAccessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

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
            getJdbcTemplate().update("INSERT INTO FILE_INFO (FILE_NAME, FILE_SIZE, LOADING_DATE, ID_LOCO, RECORDS_COUNT) VALUES (?, ?, ?, ?, ?)",
                    new Object[]{fileInfo.getFileName(), fileInfo.getFileSize(), new Timestamp(Calendar.getInstance().getTimeInMillis()), fileInfo.getLocoId(), fileInfo.getRecordsCount()});
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Transactional
    public List<FileInfo> getAll() throws DataAccessException {
        try {
            return getJdbcTemplate().query("SELECT * FROM FILE_INFO", new FileInfoMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    private class FileInfoMapper implements RowMapper<FileInfo> {

        public FileInfo mapRow(ResultSet rs, int i) throws SQLException {
            FileInfo fileInfo = new FileInfo();
            fileInfo.setFileName(rs.getString("FILE_NAME"));
            fileInfo.setFileSize(rs.getInt("FILE_SIZE"));
            fileInfo.setLoadingDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(
                    new Date(rs.getTimestamp("LOADING_DATE").getTime())));
            fileInfo.setLocoId(rs.getString("ID_LOCO"));
            fileInfo.setRecordsCount(rs.getInt("RECORDS_COUNT"));
            return fileInfo;
        }
    }
}
