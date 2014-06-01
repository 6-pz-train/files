package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.UserEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by anatoliy on 01.06.14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-servlet.xml"})
public class UserDaoImplTest {

    @Autowired
    UserDao userDao;

    @Before
    public void addUser() throws DataAccessException {
        UserEntity entity = new UserEntity();
        entity.setLogin("pupkin");
        entity.setPassword("12345");
        entity.setName("Vasiliy Pupkin");
        entity.setRole("ADMIN");
        userDao.addUser(entity);
    }

    @After
    public void deleteUser() throws DataAccessException {
        userDao.deleteUser("pupkin");
    }

    @Test
    public void testGetAllUsers() throws Exception {
        List<UserEntity> allUsers = userDao.getAllUsers();
        System.out.println("--getAllUsers--");
        System.out.println(allUsers);
    }

    @Test
    public void testGetUserByLogin() throws Exception {
        UserEntity pupkin = userDao.getUserByLogin("pupkin");
        Assert.assertEquals("pupkin", pupkin.getLogin());
    }



    @Test
    public void testUpdateUserName() throws Exception {
        userDao.updateUserName("pupkin", "Ivan");
        UserEntity pupkin = userDao.getUserByLogin("pupkin");
        Assert.assertEquals("Ivan",pupkin.getName());
    }

    @Test
    public void testUpdateUserPassword() throws Exception {
        userDao.updateUserPassword("pupkin", "321");
        UserEntity pupkin = userDao.getUserByLogin("pupkin");
        Assert.assertEquals("321",pupkin.getPassword().trim());
    }
}
