package com.vmaffioli.business;

import com.vmaffioli.kiwiland.Railroad;
import com.vmaffioli.utils.*;


public class RoutesUnderXDistance extends RouteValidation{

	public static String getRoutesUnderXDistance(String start, String end, int distance) {
		return RoutesUnderXDistance.routesUnderXDistance(start, end, distance);
	}

	private static String routesUnderXDistance(String start, String end, int distance) {
		int validated = 0;
		String fStations = "";
		for (String string : Railroad.getSTATIONS()) {
			fStations += string;
		}

		for (String station : Shuffle.getShuffle(fStations).split("")) {
			String[] twoStops = { start, station, end };
			if (Character.isDigit(getRouteValidation(Patterns.getFormatRouteParam(twoStops)).charAt(0))) {
				if (Integer.parseInt(getRouteValidation(Patterns.getFormatRouteParam(twoStops))) < distance) {
					validated++;
				}
			}
		}
		for (String station : Shuffle.getShuffle(fStations).split("")) {
			for (String stationAlt : Shuffle.getShuffle(fStations).split("")) {
				String[] threeStops = { start, station, stationAlt, end };
				if (Character.isDigit(getRouteValidation(Patterns.getFormatRouteParam(threeStops)).charAt(0))) {
					if (Integer.parseInt(getRouteValidation(Patterns.getFormatRouteParam(threeStops))) < distance) {
						validated++;
					}
				}
			}
		}

		for (String first : Shuffle.getShuffle(fStations).split("")) {
			for (String second : Shuffle.getShuffle(fStations).split("")) {
				for (String third : Shuffle.getShuffle(fStations).split("")) {
					String formatRouteParam = Patterns.getFormatRouteParam((start + first + second + third + end).split(""));
					if (Character.isDigit(getRouteValidation(formatRouteParam).charAt(0))) {
						if (Integer.parseInt(getRouteValidation(formatRouteParam)) < distance) {
							validated++;
						}
					}
				}
			}
		}

		for (String first : Shuffle.getShuffle(fStations).split("")) {
			for (String second : Shuffle.getShuffle(fStations).split("")) {
				for (String third : Shuffle.getShuffle(fStations).split("")) {
					for (String forth : Shuffle.getShuffle(fStations).split("")) {
						String formatRouteParam = Patterns.getFormatRouteParam(
								(start + first + second + third + forth + end).split(""));
						if (Character.isDigit(getRouteValidation(formatRouteParam).charAt(0))) {
							if (Integer.parseInt(getRouteValidation(formatRouteParam)) < distance) {
								validated++;
							}
						}
					}
				}
			}
		}
		for (String first : Shuffle.getShuffle(fStations).split("")) {
			for (String second : Shuffle.getShuffle(fStations).split("")) {
				for (String third : Shuffle.getShuffle(fStations).split("")) {
					for (String forth : Shuffle.getShuffle(fStations).split("")) {
						for (String fifth : Shuffle.getShuffle(fStations).split("")) {
							String formatRouteParam = Patterns.getFormatRouteParam(
									(start + first + second + third + forth + fifth + end).split(""));
							if (Character.isDigit(getRouteValidation(formatRouteParam).charAt(0))) {
								if (Integer.parseInt(getRouteValidation(formatRouteParam)) < distance) {
									validated++;
								}
							}
						}
					}
				}
			}
		}
		for (String first : Shuffle.getShuffle(fStations).split("")) {
			for (String second : Shuffle.getShuffle(fStations).split("")) {
				for (String third : Shuffle.getShuffle(fStations).split("")) {
					for (String forth : Shuffle.getShuffle(fStations).split("")) {
						for (String fifth : Shuffle.getShuffle(fStations).split("")) {
							for (String sixth : Shuffle.getShuffle(fStations).split("")) {
								String formatRouteParam = Patterns.getFormatRouteParam(
										(start + first + second + third + forth + fifth + sixth + end).split(""));
								if (Character.isDigit(getRouteValidation(formatRouteParam).charAt(0))) {
									if (Integer.parseInt(getRouteValidation(formatRouteParam)) < distance) {
										validated++;
									}
								}
							}
						}
					}
				}
			}
		}
		for (String first : Shuffle.getShuffle(fStations).split("")) {
			for (String second : Shuffle.getShuffle(fStations).split("")) {
				for (String third : Shuffle.getShuffle(fStations).split("")) {
					for (String forth : Shuffle.getShuffle(fStations).split("")) {
						for (String fifth : Shuffle.getShuffle(fStations).split("")) {
							for (String sixth : Shuffle.getShuffle(fStations).split("")) {
								for (String seventh : Shuffle.getShuffle(fStations).split("")) {
									for (String eighth : Shuffle.getShuffle(fStations).split("")) {
										String formatRouteParam = Patterns.getFormatRouteParam((start + first + second + third
												+ forth + fifth + sixth + seventh + eighth + end).split(""));
										if (Character.isDigit(getRouteValidation(formatRouteParam).charAt(0))) {
											if (Integer.parseInt(getRouteValidation(formatRouteParam)) < distance) {
												validated++;
											}

										}
									}

								}

							}

						}

					}

				}
			}
		}
		return String.valueOf(validated);
	}
}
