package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.UserDao;
import com.locostatmanager.busines.dao.entities.UserEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import org.jasypt.util.password.BasicPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by anatoliy on 01.06.14.
 */
@Service
public class UserAuthManagerImpl implements UserAuthManager {

    BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();

    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<UserEntity> getAllUsers() throws DataAccessException {
        return userDao.getAllUsers();
    }

    public UserEntity getUserByLogin(String login) throws DataAccessException {
        return userDao.getUserByLogin(login);
    }

    public void addUser(UserEntity entity) throws DataAccessException {
        String password = entity.getPassword();
        entity.setPassword(encrypt(password));
        userDao.addUser(entity);
    }

    public void updateUserName(String login, String newName) throws DataAccessException {
        userDao.updateUserName(login, newName);
    }

    public void updateUserPassword(String login, String newPassword) throws DataAccessException {
        String encrypted = encrypt(newPassword);
        userDao.updateUserPassword(login, encrypted);
    }

    private String encrypt(String password) {
        return passwordEncryptor.encryptPassword(password);
    }

    public void deleteUser(String login) throws DataAccessException {
        userDao.deleteUser(login);
    }
}
