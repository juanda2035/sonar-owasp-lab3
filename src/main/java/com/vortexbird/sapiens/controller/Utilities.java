package com.vortexbird.sapiens.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {

	public static boolean isValidEmail(String sEmail) {
		boolean isValid = false;
		
		final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pat = Pattern.compile(EMAIL_PATTERN);
		Matcher mat = pat.matcher(sEmail);
		
		if(mat.matches()) {
			isValid = true;
        }else {
			isValid = false;
        }
		return isValid;
	}
	
}
