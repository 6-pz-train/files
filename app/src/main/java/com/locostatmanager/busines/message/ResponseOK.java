package com.locostatmanager.busines.message;

/**
 *
 * @author dmitry
 */
public class ResponseOK {
    private String status;

    public ResponseOK() {
        this.status = "success";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }    
}
