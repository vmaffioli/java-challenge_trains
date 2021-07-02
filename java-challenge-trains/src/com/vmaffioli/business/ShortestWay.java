package com.vmaffioli.business;

import com.vmaffioli.kiwiland.Railroad;
import com.vmaffioli.utils.Patterns;
import com.vmaffioli.utils.Shuffle;


public class ShortestWay extends RouteValidation {
	
	public static String getShortestWay(String start, String end) {
		return shortestWay(start, end);
	}

	private static String shortestWay(String start, String end) {
		int validated = 0;
		String fStations = "";
		for (String string : Railroad.getSTATIONS()) {
			fStations += string;
		}

		for (String station : Shuffle.getShuffle(fStations).split("")) {
			String[] twoStops = { start, station, end };
			if (Character.isDigit(getRouteValidation(Patterns.getFormatRouteParam(twoStops)).charAt(0))) {
				if (validated == 0) {
					validated = Integer.parseInt(getRouteValidation(Patterns.getFormatRouteParam(twoStops)));
				} else {
					if (Integer.parseInt(getRouteValidation(Patterns.getFormatRouteParam(twoStops))) < validated) {
						validated = Integer.parseInt(getRouteValidation(Patterns.getFormatRouteParam(twoStops)));
					}
				}
			}
		}
		for (String station : Shuffle.getShuffle(fStations).split("")) {
			for (String stationAlt : Shuffle.getShuffle(fStations).split("")) {
				String[] threeStops = { start, station, stationAlt, end };
				if (Character.isDigit(getRouteValidation(Patterns.getFormatRouteParam(threeStops)).charAt(0))) {
					if (validated == 0) {
						validated = Integer.parseInt(getRouteValidation(Patterns.getFormatRouteParam(threeStops)));
					} else {
						if (Integer.parseInt(getRouteValidation(Patterns.getFormatRouteParam(threeStops))) < validated) {
							validated = Integer.parseInt(getRouteValidation(Patterns.getFormatRouteParam(threeStops)));
						}
					}
				}
			}
		}

		for (String first : Shuffle.getShuffle(fStations).split("")) {
			for (String second : Shuffle.getShuffle(fStations).split("")) {
				for (String third : Shuffle.getShuffle(fStations).split("")) {
					String formatRouteParam = Patterns.getFormatRouteParam((start + first + second + third + end).split(""));
					if (Character.isDigit(getRouteValidation(formatRouteParam).charAt(0))) {
						if (validated == 0) {
							validated = Integer.parseInt(getRouteValidation(formatRouteParam));
						} else {
							if (Integer.parseInt(getRouteValidation(formatRouteParam)) < validated) {
								validated = Integer.parseInt(getRouteValidation(formatRouteParam));
							}
						}
					}
				}
			}
		}
		return String.valueOf(validated);
	}

}
