package com.locostatmanager.busines.constants;

/**
 *
 * @author dmitry
 */
public enum Units {
    
    OSN("OSN"),
    TDVIG("TDVIG"),
    BUKS("BUKS"),
    PTRES("PTRES");
    
    private final String unitName;

    private Units(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }    
}
