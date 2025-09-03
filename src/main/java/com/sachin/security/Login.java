package com.sachin.security;

import org.springframework.stereotype.Component;

@Component
public class Login {

	private static boolean LOGIN ;

	public static boolean isLOGIN() {
		return LOGIN;
	}

	public static void setLOGIN(boolean lOGIN) {
		LOGIN = lOGIN;
	}
	
	
	
}
