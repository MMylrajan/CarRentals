package com.sht.vehicle;

import static org.junit.Assert.*;

import org.junit.Test;


public class BusTest {
	
	@Test
	public   void positiveTestForVan() {
		Bus<?> bus = new Bus<Object>();
		assertTrue(bus.getTotalExpenseForTheTrip("Pune-Mumbai-Bangalore-Pune")==41537.8);
	}

	@Test
	public   void negativeTestForBus() {
		Bus<?> bus = new Bus<Object>();
		assertFalse(bus.getTotalExpenseForTheTrip("Pune-Mumbai-Bangalore-Pune")==3066.8);
	}
	
}
