package com.locostatmanager.busines.dao.entities;

/**
 *
 * @author dmitry
 */
public class RecordStructureInfo {
    
    private String name;
    private Integer index;
    private Double delta;
    private Integer fsiId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double delta) {
        this.delta = delta;
    }

    public Integer getFsiId() {
        return fsiId;
    }

    public void setFsiId(Integer fsiId) {
        this.fsiId = fsiId;
    }
}
