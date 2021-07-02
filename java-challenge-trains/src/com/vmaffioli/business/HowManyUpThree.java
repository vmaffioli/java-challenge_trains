package com.vmaffioli.business;

import com.vmaffioli.kiwiland.Railroad;
import com.vmaffioli.utils.Patterns;


public class HowManyUpThree extends RouteValidation {
	
	public static String getHowManyUpThree(String start, String end) {
		return howManyUpThree(start, end);
	}

	private static String howManyUpThree(String start, String end) {
		int validated = 0;

		for (String station : Railroad.getSTATIONS()) {
			String[] twoStops = { start, station, end };
			if (Character.isDigit(getRouteValidation(Patterns.getFormatRouteParam(twoStops)).charAt(0))) {
				validated++;
			}
		}
		for (String station : Railroad.getSTATIONS()) {
			for (String stationAlt : Railroad.getSTATIONS()) {
				String[] threeStops = { start, station, stationAlt, end };
				if (Character.isDigit(getRouteValidation(Patterns.getFormatRouteParam(threeStops)).charAt(0))) {
					validated++;
				}
			}
		}
		return String.valueOf(validated);
	}

}
