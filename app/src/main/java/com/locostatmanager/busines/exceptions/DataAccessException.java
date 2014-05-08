package com.locostatmanager.busines.exceptions;

/**
 *
 * @author dmitry
 */
public class DataAccessException extends CustomException {

    public DataAccessException(Throwable cause) {
        super("dataAccess", cause);
    }
    
}
