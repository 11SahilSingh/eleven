package com.example.eleven_backend.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
