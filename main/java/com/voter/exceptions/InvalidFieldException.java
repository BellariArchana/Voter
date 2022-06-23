package com.voter.exceptions;

@SuppressWarnings("serial")
public class InvalidFieldException extends RuntimeException {
	public InvalidFieldException(String message) {
		super(message);
	}
}
