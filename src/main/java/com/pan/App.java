package com.pan;

import java.util.ResourceBundle;

public class App {
	
	public int getCreds(String user_nm, String pwd) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
		String username = resourceBundle.getString("username");
		String password = resourceBundle.getString("password");
		
		if(username.equalsIgnoreCase(user_nm) && password.equalsIgnoreCase(pwd))
			return 1;
		else
			return 0;
	}


}
