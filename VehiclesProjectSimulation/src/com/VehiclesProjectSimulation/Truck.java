package com.VehiclesProjectSimulation;

public class Truck extends Vehicle  {

	public void startEngine() {
		System.out.println("starting a  "+this.getModel());
		
	}
	public void stopEngine() {
		System.out.println("stopped ..."+this.getModel());
		
	}

	
}
