package com.locostatmanager.busines.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author dmitry
 */
@Controller(value = "/userSettings.html")
public class UserSettingsController {

    public String getPage(Model model) {
        return "userSettings";
    }

            //TODO put smth in model ;)
}
