package com.crozin.wykop.sdk.exception;

public class RequestException extends SdkException {
	public RequestException(String message, Integer code) {
		super(message, code);
	}
}
