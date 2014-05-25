package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.FileInfoDao;
import com.locostatmanager.busines.dao.entities.FileInfo;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dmitry
 */
@Repository
public class FileCheckInServiceImpl implements FileCheckInService {

    @Autowired
    private FileInfoDao fileInfoDao;

    public void checkIn(String fileName, Integer size) throws DataAccessException, ValidationException {

        FileInfo fileInfo = fileInfoDao.get(fileName, size);
        if (null != fileInfo) {
            throw new ValidationException("Data from file with name " + fileName + " was alrwady loaded at:" + fileInfo.getLoadingDate());
        }
    }
}
