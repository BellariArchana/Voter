package com.voter.exceptions;

@SuppressWarnings("serial")
public class NoSuchRecordException extends RuntimeException {
	public NoSuchRecordException(String message) {
		super(message);
	}
}
