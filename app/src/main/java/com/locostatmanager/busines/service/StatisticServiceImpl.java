package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.LocomotiveDao;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dmitry
 */
@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private LocomotiveDao locomotiveDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addLocomotive(LocoEntity entity) {

        locomotiveDao.add(entity);
    }

    @Transactional
    public List<LocoEntity> getAllLocomotives() {

        return locomotiveDao.getAll();
    }

    @Transactional
    public LocoEntity getLocomotiveById(String id) {

        return locomotiveDao.getById(id);
    }

    @Transactional
    public LocoEntity getLocomotiveByTitle(String title) {

        return locomotiveDao.getByTitle(title);
    }
}
