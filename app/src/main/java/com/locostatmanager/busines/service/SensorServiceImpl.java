package com.locostatmanager.busines.service;

import com.locostatmanager.busines.constants.Units;
import com.locostatmanager.busines.dao.SensorDao;
import com.locostatmanager.busines.dao.entities.SensorEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dmitry
 */
@Service
public class SensorServiceImpl implements SensorService {

    @Autowired
    private SensorDao sensorDao;

    public void add(SensorEntity entity) throws DataAccessException, ValidationException {

        sensorDao.add(entity);
    }

    public List<SensorEntity> getAll() throws DataAccessException, ValidationException {

        return sensorDao.getAll();
    }

    public List<SensorEntity> getBuks() throws DataAccessException, ValidationException {

        return sensorDao.getByUnitName(Units.BUKS.toString());
    }

    public List<SensorEntity> getOsnovn() throws DataAccessException, ValidationException {

        return sensorDao.getByUnitName(Units.OSN.toString());
    }

    public List<SensorEntity> getPTres() throws DataAccessException, ValidationException {

        return sensorDao.getByUnitName(Units.PTRES.toString());
    }

    public List<SensorEntity> getTDvig() throws DataAccessException, ValidationException {

        return sensorDao.getByUnitName(Units.TDVIG.toString());
    }

    public SensorEntity getByName(String name) throws DataAccessException, ValidationException {

        return sensorDao.getByName(name);
    }

    public String getCount() throws DataAccessException, ValidationException {

        return sensorDao.getCount();
    }

}
