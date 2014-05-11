package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.StatisticService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping(value = "/trains.htm")
public class LocomotiveController {

    @Autowired
    private LocomotiveService locomotiveService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getPage(Model model) {
        return "trains";
    }

    @ModelAttribute("locomotives")
    public List<LocoEntity> getLocomotives() throws ValidationException, DataAccessException {
        return locomotiveService.getAll();
    }
}
