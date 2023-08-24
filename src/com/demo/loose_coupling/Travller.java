package com.demo.loose_coupling;

public class Travller {
	
	Vehicle vehicle;
	
	public void setVehicle(Vehicle vehicle) {
		
		this.vehicle=vehicle;
	}
	
	public void startJourney() {
		
		System.out.println("starting journey!!..");
		
		vehicle.move();
	}

}
