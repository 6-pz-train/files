package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.entities.FileInfo;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface FileCheckInService {
    
    void checkIn(String fileName, Integer size)  throws ValidationException, DataAccessException;
    void addFileInfo(String fileName, Integer size, String locoId, Integer recordsCount)  throws DataAccessException;
}
