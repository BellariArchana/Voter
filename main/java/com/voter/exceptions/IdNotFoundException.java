package com.voter.exceptions;

@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException {
	public IdNotFoundException(String string) {
		super(string);
	}

}