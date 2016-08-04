package com.sht.vehicle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {
	
	@Test
	public   void positiveTestForCar() {
		Car<Object> car = new Car<Object>();
		assertTrue(car.getTotalExpenseForTheTrip("Pune-Mumbai-Bangalore-Pune")==32793.0);
	}

	@Test
	public   void negativeTestForCar() {
		Car<Object> car = new Car<Object>();
		assertFalse(car.getTotalExpenseForTheTrip("Pune-Mumbai-Bangalore-Pune")==3066.8);
	}
	
}
