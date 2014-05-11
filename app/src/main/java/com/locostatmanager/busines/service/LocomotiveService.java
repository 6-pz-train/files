package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface LocomotiveService {

    void add(LocoEntity entity) throws ValidationException, DataAccessException;
    void add(String id, String title) throws ValidationException, DataAccessException;
    void delete(String id) throws ValidationException, DataAccessException;
    List<LocoEntity> getAll() throws ValidationException, DataAccessException;
    LocoEntity getById(String id) throws ValidationException, DataAccessException;
    LocoEntity getByTitle(String title) throws ValidationException, DataAccessException;
    String getCount() throws ValidationException, DataAccessException;
}
