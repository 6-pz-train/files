package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.LocomotiveDao;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
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
public class LocomotiveServiceImpl implements LocomotiveService {
    
    @Autowired
    private LocomotiveDao locomotiveDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void add(LocoEntity entity) throws ValidationException, DataAccessException {
      
            locomotiveDao.add(entity);
    }

    @Transactional
    public List<LocoEntity> getAll() throws ValidationException, DataAccessException {
        
        return locomotiveDao.getAll();
    }

    @Transactional
    public LocoEntity getById(String id) throws ValidationException, DataAccessException {
        
        return locomotiveDao.getById(id);
    }

    @Transactional
    public LocoEntity getByTitle(String title) throws ValidationException, DataAccessException {
        
        return locomotiveDao.getByTitle(title);
    }

    @Transactional
    public String getCount() throws ValidationException, DataAccessException {
        return locomotiveDao.getCount();
    }
    
}
