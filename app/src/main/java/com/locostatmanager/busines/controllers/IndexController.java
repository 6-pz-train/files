package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.message.LocomotiveStatistic;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.SensorService;
import com.locostatmanager.busines.service.StatisticService;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;
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
@RequestMapping(value = {"/", "index.htm"})
public class IndexController {

    @Autowired
    private LocomotiveService locomotiveService;
    @Autowired
    private SensorService sensorService;
    @Autowired
    private StatisticService statisticService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        return "index";
    }

    @ModelAttribute("sensorCount")
    public String getSensorCount() throws ValidationException, DataAccessException {

        return sensorService.getCount();
    }

    @ModelAttribute("locoCount")
    public String getLocoCount() throws ValidationException, DataAccessException {

        return locomotiveService.getCount();
    }

    @ModelAttribute("lastUpdate")
    public String getLustUpdate() throws ValidationException, DataAccessException {

        return new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    }

    @ModelAttribute("dbSize")
    public String getDbSize() throws ValidationException, DataAccessException {

        return "176.7MB";
    }

    @ModelAttribute("locoRatio")
    public List<LocomotiveStatistic> getLocoRatio() throws ValidationException, DataAccessException, IOException {

        return statisticService.getLocomotivesRatio();
    }

    @ModelAttribute("locoPercentage")
    public List<LocomotiveStatistic> getLocoPercentage() throws ValidationException, DataAccessException {

        return statisticService.getLocomotivesPercentage();
    }
}
