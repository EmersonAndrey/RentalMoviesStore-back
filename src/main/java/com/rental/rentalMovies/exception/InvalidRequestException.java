package com.rental.rentalMovies.exception;

public class InvalidRequestException extends RuntimeException {
    
    public InvalidRequestException(String message){
        super(message);
    }
}
