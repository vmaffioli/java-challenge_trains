package com.vmaffioli.utils;


public class ValidateSchema {
	
	public static boolean getValidateSchema(String fileContent) {
		return validateSchema(fileContent);
	}

	private static boolean validateSchema(String fileContent) {
		boolean result = false;
		String[] routes = fileContent.replaceAll("\\W", " ").replaceAll("\\s+", " ").split(" ");
		for (String route : routes) {
			if ((route.length() != 3) && (!route.matches("\\D")) && (!route.matches("\\D")) && (!route.matches("\\d"))) {
				result = true;
			}
		}
		return result;
	}

}
