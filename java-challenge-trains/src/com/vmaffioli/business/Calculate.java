package com.vmaffioli.business;


public class Calculate {
	
	
	public static String RouteValidation(String route) {
		return RouteValidation.getRouteValidation(route);
	}
	
	public static String HowManyUpThree(String start, String end) {
		return HowManyUpThree.getHowManyUpThree(start, end);
	}
	
	public static String HowManyExactlyFour(String start, String end) {
		return HowManyExactlyFour.getHowManyExactlyFour(start, end);
	}
	
	public static String ShortestWay(String start, String end) {
		return ShortestWay.getShortestWay(start, end);
	}
	
	public static String RoutesUnderXDistance(String start, String end, int distance) {
		return RoutesUnderXDistance.getRoutesUnderXDistance(start, end, distance);
	}
	
	



}
