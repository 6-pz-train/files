package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.message.ResponseError;
import com.locostatmanager.busines.message.ResponseOK;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.StatisticService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping(value = "/statistic")
public class DataManagmentController {

    @Autowired
    private StatisticService statisticService;
    @Autowired
    private LocomotiveService locomotiveService;

    @RequestMapping(value = "/locoStat.json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<LocoDataEntity> getLocodata(@RequestParam String sdate, @RequestParam String edate, @RequestParam String id) throws DataAccessException, ValidationException {

        return statisticService.getBetween(sdate, edate, id);
    }

    @RequestMapping(value = "/addLoco", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseOK addLocomotive(@RequestParam String id, @RequestParam String title) throws ValidationException, DataAccessException {
        locomotiveService.add(id, title);
        return new ResponseOK();
    }

    @RequestMapping(value = "/deleteLoco", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseOK deleteLocomotive(@RequestParam String id) throws ValidationException, DataAccessException {
        locomotiveService.delete(id);
        return new ResponseOK();
    }
    
    @ExceptionHandler({ValidationException.class, DataAccessException.class, Exception.class})
    @ResponseBody
    public ResponseError onException(Exception e) {
        
        return new ResponseError(e.getMessage());
    }
}
