package com.sht.vehicle;

public  class RouteDistance {

	static double getRouteDistance(String route) {
		// Switch on a String argument.
		switch (route) {
		case "Pune-Mumbai-Bangalore-Pune":
			return 2186.20;
		case "Pune-Mumbai-Pune":
			return 400.00;
		case "Pune-Bangalore-Pune":
			return 2000.00;
		case "Mumbai-Bangalore":
			return 986.20;
		case "Mumbai-Delhi-Mumbai":
			return 4100.00;
		case "Mumbai-Chennai-Mumbai":
			return 2469.00;
		case "Chennai-Mumbai-Delhi-Mumbai-Chennai":
			return 6569.00;
		}
		return 0.0;
	}
}
