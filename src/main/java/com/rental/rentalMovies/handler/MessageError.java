package com.rental.rentalMovies.handler;

public class MessageError {
    
    private String message;
    private int statusCode;

    public MessageError(String message, int status) {
        this.message = message;
        this.statusCode = status;
    }

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
