package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.StatisticService;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping(value = "/")
public class LocomotiveDataController {

    @Autowired
    private StatisticService statisticService;

    @RequestMapping(value = "/locodata.json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<LocoDataEntity> getLocodata(@RequestParam String sdate, @RequestParam String edate, @RequestParam String id) throws ParseException, DataAccessException, ValidationException {
        
        return statisticService.getBetween(sdate, edate, id);
    }
}
