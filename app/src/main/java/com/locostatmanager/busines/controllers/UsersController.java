package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.UserEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.service.UserAuthManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *
 * @author dmitry
 */
@Controller()
@RequestMapping("/users.htm")
public class UsersController {

    @Autowired
    private UserAuthManager authManager;

    @RequestMapping(method = RequestMethod.GET)
    public String getpage(Model model) {
        return "users";
    }

    @ModelAttribute("users")
    public List<UserEntity> getAllUsers() throws DataAccessException {
        return authManager.getAllUsers();
    }
}
