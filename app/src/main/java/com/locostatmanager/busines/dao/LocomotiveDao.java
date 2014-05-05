package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.LocoEntity;

import java.util.List;

/**
 * Created by anatoliy on 23.04.14.
 */
public interface LocomotiveDao {

    void add (LocoEntity entity);
    List<LocoEntity> getAll ();
    LocoEntity getById (String id);
    LocoEntity getByTitle (String title);
}
