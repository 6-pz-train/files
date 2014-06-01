package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.UserEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.message.ResponseError;
import com.locostatmanager.busines.message.ResponseOK;
import com.locostatmanager.busines.service.UserAuthManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by anatoliy on 01.06.14.
 */
@Controller
@RequestMapping("/userManager")
public class UserManagerController {

    @Autowired
    private UserAuthManager authManager;

    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    public ResponseOK addUser(@Valid UserEntity entity) throws DataAccessException {
        authManager.addUser(entity);
        return new ResponseOK();
    }

    @RequestMapping(value = "/delete.json", method = RequestMethod.POST)
    @ResponseBody
    public ResponseOK delete(@RequestParam String login) throws DataAccessException {
        authManager.deleteUser(login);
        return new ResponseOK();
    }

    @RequestMapping(value = "/rename.json", method = RequestMethod.POST)
    @ResponseBody
    public ResponseOK rename(@RequestParam String login, @RequestParam String newName) throws DataAccessException {
        authManager.updateUserName(login,newName);
        return new ResponseOK();
    }

    @RequestMapping(value = "/updatePassword.json", method = RequestMethod.POST)
    @ResponseBody
    public ResponseOK updatePassword(@RequestParam String login, @RequestParam String newPassword) throws DataAccessException {
        authManager.updateUserPassword(login, newPassword);
        return new ResponseOK();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseError onException(Exception e) {
        return new ResponseError(e.getMessage());
    }
}
