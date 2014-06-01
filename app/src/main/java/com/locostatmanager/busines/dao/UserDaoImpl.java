package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.UserEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by anatoliy on 01.06.14.
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    public List<UserEntity> getAllUsers() throws DataAccessException {
        try {
            return getJdbcTemplate().query("SELECT * FROM USER", new UserRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public UserEntity getUserByLogin(String login) throws DataAccessException {
        try {
            return getJdbcTemplate().queryForObject(
                    "SELECT * FROM USER WHERE LOGIN = ?",
                    new Object[]{login},
                    new UserRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public void addUser(UserEntity entity) throws DataAccessException {
        try {
            getJdbcTemplate().update("INSERT INTO USER (LOGIN, NAME, PASSWORD, ROLE) VALUES (?,?,?,?)",
                    new Object[]{entity.getLogin(), entity.getName(), entity.getPassword(), entity.getRole()});
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public void updateUserName(String login, String newName) throws DataAccessException {
        try {
            getJdbcTemplate().update("UPDATE USER SET NAME = ? WHERE LOGIN = ?",
                    new Object[]{newName, login});
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public void updateUserPassword(String login, String newPassword) throws DataAccessException {
        try {
            getJdbcTemplate().update("UPDATE USER SET PASSWORD = ? WHERE LOGIN = ?",
                    new Object[]{newPassword, login});
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public void deleteUser(String login) throws DataAccessException {
        try {
            getJdbcTemplate().update("DELETE FROM USER WHERE LOGIN = ?",
                    new Object[]{login});
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    private class UserRowMapper implements RowMapper<UserEntity> {

        public UserEntity mapRow(ResultSet rs, int i) throws SQLException {
            UserEntity entity = new UserEntity();
            entity.setLogin(trim(rs.getString("LOGIN")));
            entity.setName(trim(rs.getString("NAME")));
            entity.setPassword(rs.getString("PASSWORD"));
            entity.setRole(trim(rs.getString("ROLE")));
            return entity;
        }
    }

    private String trim(String str) {
        return str == null ? null : str.trim();
    }
}
