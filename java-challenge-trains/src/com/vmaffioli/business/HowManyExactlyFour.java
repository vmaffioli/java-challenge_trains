package com.vmaffioli.business;

import com.vmaffioli.kiwiland.Railroad;
import com.vmaffioli.utils.Patterns;


public class HowManyExactlyFour extends RouteValidation {
	
	public static String getHowManyExactlyFour(String start, String end) {
		return howManyExactlyFour(start, end);
	}

 private static String howManyExactlyFour(String start, String end) {
		int validated = 0;
		for (String first : Railroad.getSTATIONS()) {
			for (String second : Railroad.getSTATIONS()) {
				for (String third : Railroad.getSTATIONS()) {
					if (Character
							.isDigit(getRouteValidation(Patterns.getFormatRouteParam((start + first + second + third + end).split("")))
									.charAt(0))) {
						validated++;
					}
				}
			}
		}
		return String.valueOf(validated);
	}
}
