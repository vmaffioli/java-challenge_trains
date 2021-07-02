package com.vmaffioli.kiwiland;

public class Railroad {

	private static String[] schema = {"AB5", "BC4", "CD8", "DC8", "DE6", "AD5", "CE2", "EB3", "AE7"};
	private static String[] STATIONS = { "A", "B", "C", "D", "E" };
	private static String ROUTE404MESSAGE = "NO SUCH ROUTE";

	public static String[] getSTATIONS() {
		return STATIONS;
	}

	public static String getROUTE404MESSAGE() {
		return ROUTE404MESSAGE;
	}

	public static String[] getSchema() {
		return schema;
	}

	public static String[] getBuilder(String param, boolean loadDefault) {
		return builder(param, loadDefault);
	}

	private static String[] builder(String param, boolean loadDefault) {
		if(loadDefault) {
			System.out.println("!ERROR! INPUT.txt invalid! Loading DEFAULT_SCHEMA");
		} else {
			if (!param.equals("")) {
				String[] routes = param.replaceAll("\\W", " ").replaceAll("\\s+", " ").split(" ");
				for (int i = 0; i < routes.length; i++) {
					if (i == (routes[i].split("").length - 1)) {
						schema = routes;
					}
				}
			}
		}
		
		return schema;
	}

}
