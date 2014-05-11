package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;

import java.util.List;

/**
 * Created by anatoliy on 23.04.14.
 */
public interface LocomotiveDao {

    void add(LocoEntity entity) throws DataAccessException;
    void delete(String id) throws DataAccessException;
    List<LocoEntity> getAll() throws DataAccessException;
    LocoEntity getById(String id) throws DataAccessException;
    LocoEntity getByTitle(String title) throws DataAccessException;
    String getCount() throws DataAccessException;
}
