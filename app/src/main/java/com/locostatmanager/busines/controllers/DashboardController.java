package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.dao.entities.SensorEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping(value = "/dashboard.htm")
public class DashboardController {

    @Autowired
    private LocomotiveService locomotiveService;
    @Autowired
    private SensorService sensorService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage() {
        return "dashboard";
    }

    @ModelAttribute("locomotives")
    public List<LocoEntity> getLocomotives() throws ValidationException, DataAccessException {
        return locomotiveService.getAll();
    }

    @ModelAttribute("osnov")
    public List<SensorEntity> getOsnov() throws DataAccessException, ValidationException {
        return sensorService.getOsnovn();
    }

    @ModelAttribute("buks")
    public List<SensorEntity> getBuks() throws DataAccessException, ValidationException {
        return sensorService.getBuks();
    }

    @ModelAttribute("ptres")
    public List<SensorEntity> getPTres() throws DataAccessException, ValidationException {
        return sensorService.getPTres();
    }

    @ModelAttribute("tdvig")
    public List<SensorEntity> getTDvig() throws DataAccessException, ValidationException {
        return sensorService.getTDvig();
    }

}
