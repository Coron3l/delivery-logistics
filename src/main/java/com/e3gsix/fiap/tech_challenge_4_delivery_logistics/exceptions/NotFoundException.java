package com.e3gsix.fiap.tech_challenge_4_delivery_logistics.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}