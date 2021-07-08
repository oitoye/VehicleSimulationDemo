package com.VehiclesProjectSimulation;

//subclass


public class Car extends Vehicle {

	
	public void startEngine() {
		System.out.println("starting a  "+this.getModel());
		
	}
	public void stopEngine() {
		System.out.println("stopped ..."+this.getModel());
		
	}

	
	
	
}
