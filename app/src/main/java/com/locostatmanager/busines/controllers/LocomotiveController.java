package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.message.ResponseOK;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.StatisticService;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping(value = "/locomotives.htm")
public class LocomotiveController {

    @Autowired
    private StatisticService statisticService;
    @Autowired
    private LocomotiveService locomotiveService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getPage(Model model) {
        return "locomotives";
    }

    @ModelAttribute("locomotives")
    public List<LocoEntity> getLocomotives() throws ValidationException, DataAccessException {
        return locomotiveService.getAll();
    }

//    @RequestMapping(value = "/data.json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public List<LocoDataEntity> getLocodata(@RequestParam String sdate, @RequestParam String edate, @RequestParam String id) throws ParseException, DataAccessException, ValidationException {
//
//        return statisticService.getBetween(sdate, edate, id);
//    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public ResponseOK addLocomotive(@RequestParam String id, @RequestParam String title) throws ValidationException, DataAccessException {
//        locomotiveService.add(id, title);
//        return new ResponseOK();
//    }

//    @RequestMapping(value = "/delete", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public ResponseOK deleteLocomotive(@RequestParam String id) throws ValidationException, DataAccessException {
//        locomotiveService.delete(id);
//        return new ResponseOK();
//    }
}
