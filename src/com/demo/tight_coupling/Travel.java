package com.demo.tight_coupling;

public class Travel {
	
		Bike b = new Bike();
		Bus bus = new Bus();
		Car c = new Car();
	
	public void startjourney() {
		
		System.out.println("Starting Journey!!!...");
		
//		b.move();
//		bus.move();
		
		c.move();
		
	}

}
