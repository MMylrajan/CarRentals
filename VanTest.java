package com.sht.vehicle;

import static org.junit.Assert.*;

import org.junit.Test;


public class VanTest {
	
	@Test
	public   void positiveTestForVan() {
		Van van = new Van();
		assertTrue(van.getTotalExpenseForTheTrip("Pune-Mumbai-Bangalore-Pune")==34979.2);
	}

	@Test
	public   void negativeTestForVan() {
		Van van = new Van();
		assertFalse(van.getTotalExpenseForTheTrip("Pune-Mumbai-Bangalore-Pune")==3066.8);
	}
	
}
