package com.shubham.testingapp.testingapp.exceptions;

import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
