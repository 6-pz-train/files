package com.locostatmanager.busines.controllers;

import com.locostatmanager.busines.dao.FileStructureInfoDao;
import com.locostatmanager.busines.dao.entities.FileStructureInfo;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import com.locostatmanager.busines.exceptions.ValidationException;
import com.locostatmanager.busines.service.DataLoadingService;
import com.locostatmanager.busines.service.FileCheckInService;
import com.locostatmanager.busines.service.LocomotiveService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

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
    @Autowired
    private FileCheckInService checkInService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        return "downloadData";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String uploadFiles(
            MultipartHttpServletRequest request,
            @RequestParam String fileType,
            @RequestParam String locoId,
            Model model) throws Exception {

        Map<String, MultipartFile> fileMap = request.getFileMap();

        for (MultipartFile file : fileMap.values()) {

            if (!file.getOriginalFilename().contains(".dat")) {
                throw new ValidationException("Файл має невірне розширення або покодженно!");
            }
            checkInService.checkIn(file.getOriginalFilename(), (int) file.getSize());
            dataLoadingService.loadData(file.getBytes(), fileType);
        }
        model.addAttribute("success", "We will rock you!");// сообщение пока не используется, нужно для красивой зеленой строчки
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

    @ExceptionHandler(Exception.class)
    public ModelAndView onException(Exception e) {

        ModelAndView mv = new ModelAndView("downloadData");
        mv.addObject("errMsg", e.getMessage());
        return mv;
    }
}
