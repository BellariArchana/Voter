package com.voter.exceptions;

@SuppressWarnings("serial")
public class NoSuchVoterException extends RuntimeException {
	public NoSuchVoterException(String message) {
		super(message);
	}
}
