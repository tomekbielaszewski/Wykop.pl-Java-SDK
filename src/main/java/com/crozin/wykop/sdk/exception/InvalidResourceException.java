package com.crozin.wykop.sdk.exception;

public class InvalidResourceException extends SdkException {
	public InvalidResourceException(String message, Integer code) {
		super(message, code);
	}
}
