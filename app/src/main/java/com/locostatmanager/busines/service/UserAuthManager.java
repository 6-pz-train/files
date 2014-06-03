package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.UserDao;
import com.locostatmanager.busines.dao.entities.UserEntity;

/**
 * Created by anatoliy on 01.06.14.
 */
public interface UserAuthManager extends UserDao {
    boolean checkPassword(UserEntity entity, String plainPass);
}
