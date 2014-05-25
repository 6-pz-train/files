package com.locostatmanager.busines.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dmitry
 */
@Controller()
@RequestMapping("users.htm")
public class UsersController {

    @RequestMapping(method = RequestMethod.GET)
    public String getpage(Model model) {
        return "users";
    }
        //TODO put smth in model ;)
}
