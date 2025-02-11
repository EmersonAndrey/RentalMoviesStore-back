package com.rental.rentalMovies.exception;

public class ExistingUserException extends RuntimeException {

    public ExistingUserException(String message) {
        super(message);
    }
}
