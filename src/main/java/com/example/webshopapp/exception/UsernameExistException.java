package com.example.webshopapp.exception;

import org.springframework.security.core.AuthenticationException;

public class UsernameExistException extends AuthenticationException {
    public UsernameExistException(String msg) {
        super(msg);
    }
}
