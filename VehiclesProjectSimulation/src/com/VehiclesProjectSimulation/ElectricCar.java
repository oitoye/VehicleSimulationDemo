package com.VehiclesProjectSimulation;

public class ElectricCar extends Vehicle {


	public void startEngine() {
		System.out.println("starting ... "+this.getModel());
		
	}

	public void stopEngine() {
		System.out.println("stopped ..."+this.getModel());
		
	}

}
