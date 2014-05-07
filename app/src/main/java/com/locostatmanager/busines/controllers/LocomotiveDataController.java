package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.StatisticService;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        Date sDate = dateFormat.parse(sdate);
        Date eDate = dateFormat.parse(edate);
        LocoEntity entity = new LocoEntity();
        entity.setIdLoco(id);
        //return statisticService.getByLocomotive(entity);
        return statisticService.getBetween(new Timestamp(sDate.getTime()), new Timestamp(eDate.getTime()), entity);
    }
}
