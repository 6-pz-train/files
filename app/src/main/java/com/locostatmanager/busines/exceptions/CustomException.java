package com.locostatmanager.busines.exceptions;

/**
 *
 * @author dmitry
 */
public class CustomException extends Exception {

    protected String type;

    public CustomException(String type, Throwable cause) {
        super(cause);
        this.type = type;
    }
}
