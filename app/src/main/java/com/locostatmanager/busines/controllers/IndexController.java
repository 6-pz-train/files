package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.dao.entities.SensorEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.SensorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping(value = "/index.html")
public class IndexController {

    @Autowired
    private LocomotiveService locomotiveService;
    @Autowired
    private SensorService sensorService;

    public String getPage() {
        return "index.html";
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
