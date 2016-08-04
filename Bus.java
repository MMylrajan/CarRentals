package com.sht.vehicle;

public class Bus<isACVehicle> implements Vehicle {

	@Override
	public int getNumberOfPassengers() {
		return 40;
	}

	@Override
	public boolean isDiselType() {
		return true;
	}

	@Override
	public boolean isACVehicle() {
		return false;
	}

	@Override
	public double getTotalTripDistance(String route) {
		double routeDistance = RouteDistance.getRouteDistance(route);
		return routeDistance;
	}

	@Override
	public double getStandardRate() {
		return 15.00;
	}

	@Override
	public double getTotalExpenseForTheTrip(String route) {
		double expense = 0.0;
		int additionalPassengers = getNumberOfPassengers()
				- getMaxNumberOfPassengers();

		expense = getTotalTripDistance(route) * getStandardRate();
		if (isACVehicle()) {
			expense = expense + getTotalTripDistance(route) * (2.00);
		}
		if (isDiselType()) {
			expense = expense - getTotalTripDistance(route) * (1.00);
		}
		if (additionalPassengers > 0) {
			expense = expense + getTotalTripDistance(route)
					* additionalPassengers;
		}
		return expense;
	}

	@Override
	public int getMaxNumberOfPassengers() {
		return 35;
	}

}
