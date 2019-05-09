package com.businessdecision.rest.security.jwt.resource;

public class AuthenticationException extends RuntimeException {

	private static final long serialVersionUID = -3168894556569769059L;

	public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}

