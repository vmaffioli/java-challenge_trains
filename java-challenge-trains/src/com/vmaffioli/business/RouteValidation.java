package com.vmaffioli.business;

import com.vmaffioli.kiwiland.Railroad;

public class RouteValidation {

	public static String getRouteValidation(String param) {
		return routeValidation(param);
	}
	
	private static String routeValidation(String param) { 	
		String[] route;
		String result;
		int[] calcTemp = { 0, 0 };
		route = param.replaceAll("-", " ").split(" ");
		for (int i = 0; i < route.length - 1; i++) {
			for (String routeOnSchema : Railroad.getSchema()) {
				try {
					String external = route[i] + route[i + 1],
							internal = routeOnSchema.split("")[0] + routeOnSchema.split("")[1];
					if (external.equals(internal)) {
						calcTemp[0] += Integer.parseInt(routeOnSchema.split("")[routeOnSchema.split("").length - 1]);
						calcTemp[1]++;
					}
				} catch (Exception e) {
					System.out.println("!ERROR! com.vmaffioli.business.Calculate.RouteDistance  -> " + e);
				}
			}
		}
		if (calcTemp[1] == route.length - 1) {
			result = String.valueOf(calcTemp[0]);
		} else {
			result = Railroad.getROUTE404MESSAGE();
		}
		return result;
	}	

}
