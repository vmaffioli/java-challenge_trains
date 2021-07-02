package com.vmaffioli.utils;

public class Patterns {
	
	public static String getFormatRouteParam(String[] route) {
		return formatRouteParam(route);
	}
	private static String formatRouteParam(String[] route) {
		String result = null;
		for (int i = 0; i < route.length; i++) {
			if (i == 0) {
				result = route[0];
			} else if (i == route.length - 1) {
				result += "-" + route[route.length - 1];
			} else {
				result += "-" + route[i];
			}
		}
		return result;
	}

}
