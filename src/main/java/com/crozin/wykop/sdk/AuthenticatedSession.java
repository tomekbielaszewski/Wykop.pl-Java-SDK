package com.crozin.wykop.sdk;

public class AuthenticatedSession extends Session {
	AuthenticatedSession(Application app, String authenticationKey) {
		super(app);
		
		apiParameters.put("userkey", authenticationKey);
	}
}