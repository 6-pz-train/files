package com.locostatmanager.busines.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author dmitry
 */
@Controller(value = "/downloadData.html")
public class DownloadDataController {
    
    public String getPage(Model model) {
        return "downloadData";
    }
    
    //TODO put smth in model ;)
}
