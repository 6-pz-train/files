package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.FileStructureInfo;
import com.locostatmanager.busines.exceptions.DataAccessException;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface FileStructureInfoDao {
    
    FileStructureInfo get() throws DataAccessException;
    List<FileStructureInfo> getAll() throws DataAccessException;
}
