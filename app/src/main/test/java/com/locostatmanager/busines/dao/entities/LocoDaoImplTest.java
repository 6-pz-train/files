package com.locostatmanager.busines.dao.entities;

import com.locostatmanager.busines.dao.LocoDao;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.security.RunAs;
import java.util.List;

/**
 * Created by anatoliy on 23.04.14.
 */
//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-servlet.xml"})
public class LocoDaoImplTest {

    @Autowired
    LocoDao locoDao;
    @Test
    public void testAddSensor() throws Exception {
        List<SensorEntity> allSensors = locoDao.getAllSensors();
        System.out.println(allSensors);
    }

    @Test
    public void testGetAllSensors() throws Exception {

    }
}
