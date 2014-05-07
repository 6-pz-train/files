/*
 * =============================================================================
 * 
 *   Copyright (c) 2011, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package thymeleafexamples.stsm.web.controller;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.dao.entities.SensorEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.LocomotiveService;
import com.locostatmanager.busines.service.SensorService;
import com.locostatmanager.busines.service.StatisticService;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import thymeleafexamples.stsm.business.entities.Feature;
import thymeleafexamples.stsm.business.entities.Row;
import thymeleafexamples.stsm.business.entities.SeedStarter;
import thymeleafexamples.stsm.business.entities.Type;
import thymeleafexamples.stsm.business.entities.Variety;
import thymeleafexamples.stsm.business.services.SeedStarterService;
import thymeleafexamples.stsm.business.services.VarietyService;

@Controller
public class SeedStarterMngController {

    @Autowired
    private VarietyService varietyService;

    @Autowired
    private SeedStarterService seedStarterService;

    @Autowired
    private LocomotiveService locomotiveService;

    @Autowired
    private SensorService sensorService;

    @Autowired
    private StatisticService statisticService;

    @RequestMapping(value = "/testLoco", method = RequestMethod.GET)
    @ResponseBody
    public void testLoco() throws ValidationException, DataAccessException {

        LocoEntity entity = new LocoEntity();
        entity.setIdLoco("99");
        entity.setTitleLoco("AH7809-LOCOC");
        locomotiveService.add(entity);

        LocoEntity entity1 = new LocoEntity();
        entity1.setIdLoco("100");
        entity1.setTitleLoco("A809-LOCOC12");
        locomotiveService.add(entity1);

        List<LocoEntity> list = locomotiveService.getAll();
        LocoEntity locoEntity = locomotiveService.getById("100");
        LocoEntity le = locomotiveService.getByTitle("AH7809-LOCOC");
        String count = locomotiveService.getCount();
        Integer i = 0;
    }

    @RequestMapping(value = "/testSensor", method = RequestMethod.GET)
    @ResponseBody
    public void testSensor() throws DataAccessException, ValidationException {

        SensorEntity entity = new SensorEntity();
        entity.setName("Termometr");
        entity.setDescription("For temperature");
        entity.setUnitOfMeasure("Celsius");

        SensorEntity entity1 = new SensorEntity();
        entity1.setName("Ampermetr");
        entity1.setDescription("For tok");
        entity1.setUnitOfMeasure("Amper");

        sensorService.add(entity);
        sensorService.add(entity1);
        List<SensorEntity> list = sensorService.getAll();
        SensorEntity sensorEntity = sensorService.getByName("Ampermetr");
        String count = sensorService.getCount();
        Integer i = 0;
    }

    @RequestMapping(value = "/testStat", method = RequestMethod.GET)
    @ResponseBody
    public void testStat() throws DataAccessException, ValidationException {
        
        List<LocoDataEntity> list = statisticService.getAll();
        LocoDataEntity dataEntity = statisticService.getById("1");

        LocoEntity entity = new LocoEntity();
        entity.setIdLoco("L001dp");
        entity.setTitleLoco("AH7809-LOCOC");
        //locomotiveService.add(entity);
        
        List<LocoDataEntity> list1 = statisticService.getByLocomotive(entity);
        
        List<LocoDataEntity> list2 = statisticService.getAfter(new Timestamp(Calendar.getInstance().getTimeInMillis()));
        List<LocoDataEntity> list3 = statisticService.getBefore(new Timestamp(Calendar.getInstance().getTimeInMillis()));
        

        String i = "";

    }

    public SeedStarterMngController() {
        super();
    }

    @ModelAttribute("allTypes")
    public List<Type> populateTypes() {
        return Arrays.asList(Type.ALL);
    }

    @ModelAttribute("allFeatures")
    public List<Feature> populateFeatures() {
        return Arrays.asList(Feature.ALL);
    }

    @ModelAttribute("allVarieties")
    public List<Variety> populateVarieties() {
        return this.varietyService.findAll();
    }

    @ModelAttribute("allSeedStarters")
    public List<SeedStarter> populateSeedStarters() {
        return this.seedStarterService.findAll();
    }

    @RequestMapping({"/", "/seedstartermng"})
    public String showSeedstarters(final SeedStarter seedStarter) {
        seedStarter.setDatePlanted(Calendar.getInstance().getTime());
        return "seedstartermng";
    }

    @RequestMapping(value = "/seedstartermng", params = {"save"})
    public String saveSeedstarter(final SeedStarter seedStarter, final BindingResult bindingResult, final ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "seedstartermng";
        }
        this.seedStarterService.add(seedStarter);
        model.clear();
        return "redirect:/seedstartermng";
    }

    @RequestMapping(value = "/seedstartermng", params = {"addRow"})
    public String addRow(final SeedStarter seedStarter, final BindingResult bindingResult) {
        seedStarter.getRows().add(new Row());
        return "seedstartermng";
    }

    @RequestMapping(value = "/seedstartermng", params = {"removeRow"})
    public String removeRow(final SeedStarter seedStarter, final BindingResult bindingResult, final HttpServletRequest req) {
        final Integer rowId = Integer.valueOf(req.getParameter("removeRow"));
        seedStarter.getRows().remove(rowId.intValue());
        return "seedstartermng";
    }

}
