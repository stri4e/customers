package com.github.customers.exceptions;

public class NotFound extends RuntimeException {

    public NotFound() {
    }

    public NotFound(String message) {
        super(message);
    }
}
