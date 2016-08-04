package com.sht.vehicle;

public interface Vehicle
{
  public int getNumberOfPassengers();
  public boolean isDiselType();
  public boolean isACVehicle();
  public double getTotalTripDistance(String trip);
  public double getStandardRate();
  public int getMaxNumberOfPassengers();
  public double getTotalExpenseForTheTrip(String route);
}

