package com.locostatmanager.busines.dao.entities;

/**
 *
 * @author dmitry
 */
public class FileStructureInfo {
    
    private Long id; 
    private Integer recordsStartIndex;
    private Integer recordLength;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRecordsStartIndex() {
        return recordsStartIndex;
    }

    public void setRecordsStartIndex(Integer recordsStartIndex) {
        this.recordsStartIndex = recordsStartIndex;
    }

    public Integer getRecordLength() {
        return recordLength;
    }

    public void setRecordLength(Integer recordLength) {
        this.recordLength = recordLength;
    }
}
