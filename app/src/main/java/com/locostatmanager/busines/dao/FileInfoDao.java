package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.FileInfo;
import com.locostatmanager.busines.exceptions.DataAccessException;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface FileInfoDao {
    
    FileInfo get(String fileName, Integer fileSize) throws DataAccessException;
    void add(FileInfo fileInfo) throws DataAccessException;
    List<FileInfo> getAll() throws DataAccessException;
}
