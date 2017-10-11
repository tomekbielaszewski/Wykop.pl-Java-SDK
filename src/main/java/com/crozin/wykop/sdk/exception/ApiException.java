package com.crozin.wykop.sdk.exception;

public class ApiException extends SdkException {
	public ApiException(String message, Integer code) {
		super(message, code);
	}
}