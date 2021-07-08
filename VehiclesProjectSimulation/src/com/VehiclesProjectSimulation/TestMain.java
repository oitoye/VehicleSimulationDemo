package com.VehiclesProjectSimulation;

import java.util.Scanner;



public class TestMain  {
Scanner scanner;

public Parts_Accessories pa;


	public static void main(String[] args) {
		TestMain t = new TestMain();
	
		t.go();
	}

	public void go() {
		// create a Honda
		Vehicle car = new Car();
		car.addV(car);
		car.setColor("Maroon");
		car.setModel("Honda Fit");
		car.setType("Honda");
		car.setCountryOfManufacture("Japan");
		car.startEngine();
		
		// create a subaru 
		Vehicle car2 = new Car();
		car2.addV(car2);
		car2.setModel("Subaru B4");
		car2.setColor("Silver");
		car2.setType("Subaru");
		car2.setCountryOfManufacture("Japan");
		
		// create a bmw 
		Vehicle car3 = new Car();
		car3.addV(car3);
		car3.setModel("BMW 320i");
		car3.setColor("Silver");
		car3.setType("BMW");
		car3.setCountryOfManufacture("Germany");
		
		
		
		
		/// creating a truck
	Vehicle truck = new Truck();
		truck.addV(truck);
		truck.setColor("Blue");
		truck.setModel("Scania 2246");
		truck.setType("Scania");
		truck.setCountryOfManufacture("Japan");
		truck.startEngine();
		
		
		// create an Electric car
		Vehicle elect= new ElectricCar();
		elect.addV(car2);
		elect.setModel("Electric car 001");
		elect.setColor("Silver");
		elect.setType("Electric car");
		elect.setCountryOfManufacture("Kenya");
		elect.startEngine();
		
		
		
		
		//print vehicle status
		        System.out.println("   ");
				car.printVehicleDetails(car);
				System.out.println("   ");
				car2.printVehicleDetails(car2);
				System.out.println("   ");
				car3.printVehicleDetails(car3);
				System.out.println("   ");
				elect.printVehicleDetails(elect);			
				System.out.println("   ");
				truck.printVehicleDetails(truck);
			
		
		
		
		
		
		
	}
	
	
}
