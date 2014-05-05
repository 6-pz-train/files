package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.entities.LocoEntity;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface StatisticService {

    void addLocomotive(LocoEntity entity);
    List<LocoEntity> getAllLocomotives();
    LocoEntity getLocomotiveById(String id);
    LocoEntity getLocomotiveByTitle(String title);
}
