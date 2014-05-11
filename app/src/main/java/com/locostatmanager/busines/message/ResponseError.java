package com.locostatmanager.busines.message;

/**
 *
 * @author dmitry
 */
public class ResponseError {
    
    private final String status;
    private final String message;
    
    public ResponseError(String message) {
        status = "error";
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }    
}
