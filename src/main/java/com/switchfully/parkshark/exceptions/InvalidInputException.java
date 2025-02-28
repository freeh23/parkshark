package com.switchfully.parkshark.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException {

    private static final String INVALID_INPUT = "Not a valid input.";

    public InvalidInputException() {
        super(INVALID_INPUT);
    }
}
