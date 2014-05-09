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

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping(value = "/db_info.html")
public class DdInfoController {

    @Autowired
    private LocomotiveService locomotiveService;
    @Autowired
    private StatisticService statisticService;
    @Autowired
    private SensorService sensorService;

    public String getPage(Model model) {
        return "db_info";
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
    public String getStatCount() throws ValidationException, DataAccessException {
        return statisticService.getCount();
    }

    @ModelAttribute("dbSize")
    public String getDbSize() throws ValidationException, DataAccessException {
        return "176.7MB";
    }
}
