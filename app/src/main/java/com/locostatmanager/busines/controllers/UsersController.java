package com.locostatmanager.busines.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author dmitry
 */
@Controller(value = "/users.html")
public class UsersController {

    public String getpage(Model model) {
        return "users";
    }
        //TODO put smth in model ;)
}
