package com.locostatmanager.busines.dao.entities;

import java.sql.Timestamp;

/**
 *
 * @author dmitry
 */
public class FileInfo {
    
    private String fileName;
    private Integer fileSize;
    private Timestamp loadingDate;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Timestamp getLoadingDate() {
        return loadingDate;
    }

    public void setLoadingDate(Timestamp loadingDate) {
        this.loadingDate = loadingDate;
    }
}
