package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.FileStructureInfoDao;
import com.locostatmanager.busines.dao.entities.FileStructureInfo;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.LocomotiveService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author dmitry
 */
@Controller(value = "/downloadData.html")
public class DownloadDataController {

    @Autowired
    private LocomotiveService locomotiveService;
    @Autowired
    private FileStructureInfoDao fileStructureInfoDao;

    public String getPage(Model model) {
        return "downloadData";
    }

    @ModelAttribute("locomotives")
    public List<LocoEntity> getLocomotives() throws ValidationException, DataAccessException {
        return locomotiveService.getAll();
    }

    @ModelAttribute("fileNames")
    public List<String> getFileNames() throws DataAccessException {
        List<String> fileNames = new ArrayList<String>();
        
        for (FileStructureInfo fileStructureInfo : fileStructureInfoDao.getAll()) {
            fileNames.add(fileStructureInfo.getType());
        }
        return fileNames;
    }
}
