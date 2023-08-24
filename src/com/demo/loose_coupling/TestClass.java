package com.demo.loose_coupling;

public class TestClass {

	public static void main(String[] args) {

		Travller t = new Travller();
		t.setVehicle(new Car());

		t.startJourney();
	}

}
