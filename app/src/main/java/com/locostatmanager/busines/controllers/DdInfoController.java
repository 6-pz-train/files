package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.SensorService;
import com.locostatmanager.busines.service.StatisticService;
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
@RequestMapping(value = "/dataBaseInfo.htm")
public class DdInfoController {

    @Autowired
    private LocomotiveService locomotiveService;
    @Autowired
    private StatisticService statisticService;
    @Autowired
    private SensorService sensorService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        return "dataBaseInfo";
    }

    @ModelAttribute("locosCount")
    public String getLocomotivesCount() throws ValidationException, DataAccessException {
        return locomotiveService.getCount();
    }

    @ModelAttribute("sensorsCount")
    public String getSensorsCount() throws ValidationException, DataAccessException {
        return sensorService.getCount();
    }

    @ModelAttribute("statCount")
    public int getStatCount() throws ValidationException, DataAccessException {
        return statisticService.getCount();
    }

    @ModelAttribute("dbSize")
    public String getDbSize() throws ValidationException, DataAccessException {
        return "176.7MB";
    }
}
