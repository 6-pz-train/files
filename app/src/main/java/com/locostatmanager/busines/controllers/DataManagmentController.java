package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.DataDao;
import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.dao.entities.SensorEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.message.ResponseError;
import com.locostatmanager.busines.message.ResponseOK;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.SensorService;
import com.locostatmanager.busines.service.StatisticService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
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
    @Autowired
    private SensorService sensorService;
    @Autowired
    private DataDao dataDao;

    @RequestMapping(value = "/sensor", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SensorEntity getSensor() throws DataAccessException, ValidationException {
        SensorEntity entity = sensorService.getByName("NAPR_ACCUM_BATR_SEC_A");
        return entity;
    }

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

    @RequestMapping(value = "locomotives/add/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseOK addLoco(@PathVariable String id, @RequestParam String title) throws ValidationException, DataAccessException {
        locomotiveService.add(id, title);
        return new ResponseOK();
    }

    @RequestMapping(value = "/locomotives/delete/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseOK deleteLoco(@PathVariable String id) throws ValidationException, DataAccessException {
        locomotiveService.delete(id);
        return new ResponseOK();
    }

    @RequestMapping(value = "/locomotives", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<LocoEntity> locomotives() throws ValidationException, DataAccessException {
        return locomotiveService.getAll();
    }

    @RequestMapping(value = "/sensors", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<SensorEntity> getAllSensor() throws DataAccessException, ValidationException {

        return sensorService.getAll();
    }

    @RequestMapping(value = "/sensors/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SensorEntity getSensorByName(@PathVariable String name) throws DataAccessException, ValidationException {
        SensorEntity entity = sensorService.getByName(name);
        return entity;
    }

    @RequestMapping(value = "/locomotive/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<LocoDataEntity> getStatistic(@RequestParam String sdate, @RequestParam String edate, @PathVariable String id) throws DataAccessException, ValidationException {

        LocoEntity entity = new LocoEntity();
        entity.setIdLoco("VL100");
        entity.setTitleLoco("");
        List<LocoDataEntity> list = dataDao.getByLocomotive(entity);
        return list;
    }

    @ExceptionHandler({ValidationException.class, DataAccessException.class, Exception.class})
    @ResponseBody
    public ResponseError onException(Exception e) {

        return new ResponseError(e.getMessage());
    }
}
