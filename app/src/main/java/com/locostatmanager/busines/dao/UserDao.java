package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.UserEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;

import java.util.List;

/**
 * Created by anatoliy on 01.06.14.
 */
public interface UserDao {
    List<UserEntity> getAllUsers() throws DataAccessException;;
    UserEntity getUserByLogin(String login) throws DataAccessException;;
    void addUser(UserEntity entity) throws DataAccessException;;
    void updateUserName(String login, String newName) throws DataAccessException;;
    void updateUserPassword(String login, String newPassword) throws DataAccessException;
    void deleteUser(String login) throws DataAccessException;
}
