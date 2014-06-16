package com.locostatmanager.busines.dao.entities;

import java.sql.Timestamp;

/**
 *
 * @author dmitry
 */
public class FileInfo {
    
    private String fileName;
    private Integer fileSize;
    private String loadingDate;
    private String locoId;
    private Integer recordsCount;

    public String getLoadingDate() {
        return loadingDate;
    }

    public void setLoadingDate(String loadingDate) {
        this.loadingDate = loadingDate;
    }
    

    public String getLocoId() {
        return locoId;
    }

    public void setLocoId(String locoId) {
        this.locoId = locoId;
    }

    public Integer getRecordsCount() {
        return recordsCount;
    }

    public void setRecordsCount(Integer recordsCount) {
        this.recordsCount = recordsCount;
    }
    
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

}
