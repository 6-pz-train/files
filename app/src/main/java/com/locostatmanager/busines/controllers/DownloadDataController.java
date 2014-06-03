package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.FileStructureInfoDao;
import com.locostatmanager.busines.dao.entities.FileStructureInfo;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.DataLoadingService;
import com.locostatmanager.busines.service.LocomotiveService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 *
 * @author dmitry
 */
@Controller()
@RequestMapping(value = "/downloadData.htm")
public class DownloadDataController {

    @Autowired
    private LocomotiveService locomotiveService;
    @Autowired
    private FileStructureInfoDao fileStructureInfoDao;
    @Autowired
    private DataLoadingService dataLoadingService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        return "downloadData";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String uploadFiles(
            MultipartHttpServletRequest request,
            @RequestParam String fileType,
            @RequestParam String locoId,
            Model model) throws IOException, Exception {

        Map<String, MultipartFile> fileMap = request.getFileMap();

        MultipartFile next = fileMap.values().iterator().next();
        dataLoadingService.loadData(next.getBytes(), fileType);

        for(MultipartFile file: fileMap.values()){
            file.getOriginalFilename();
        }
        model.addAttribute("success", "Кількість завантаженіх записів, можливо");
        return "downloadData";
    }



    @ModelAttribute("locomotives")
    public List<LocoEntity> getLocomotives() throws ValidationException, DataAccessException {
        return locomotiveService.getAll();
    }

    @ModelAttribute("fileTypes")
    public List<FileStructureInfo> getFileNames() throws DataAccessException {
        return fileStructureInfoDao.getAll();
    }
}
