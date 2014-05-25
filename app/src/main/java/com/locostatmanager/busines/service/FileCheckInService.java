package com.locostatmanager.busines.service;

import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;

/**
 *
 * @author dmitry
 */
public interface FileCheckInService {
    
    void checkIn(String fileName, Integer size)  throws ValidationException, DataAccessException;
}
