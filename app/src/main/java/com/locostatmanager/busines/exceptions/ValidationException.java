package com.locostatmanager.busines.exceptions;

/**
 *
 * @author dmitry
 */
public class ValidationException extends CustomException {

    public ValidationException(Throwable cause) {
        super("validation", cause);
    }
}
