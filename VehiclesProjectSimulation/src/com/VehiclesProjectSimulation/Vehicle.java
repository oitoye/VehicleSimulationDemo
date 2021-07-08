package com.VehiclesProjectSimulation;

import java.util.ArrayList;

// super class
public abstract class Vehicle {
	
	
	private String model;
	private String type;
	private String countryOfManufacture;
	private String color;
	private ArrayList<Vehicle> vehicle;
	private  Parts_Accessories pas;
	private boolean engineOff =true;
	
	
	public Vehicle() {
		vehicle = new ArrayList<Vehicle>();
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountryOfManufacture() {
		return countryOfManufacture;
	}
	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	public void addV(Vehicle v) {
		vehicle.add(v);
		
		
	}
	public void removeVehicle(Vehicle v) {
		int i=vehicle.indexOf(v);
		if(i>=0) {
			vehicle.remove(i);
		}
		
	}
	public void startEngine() {
		if(engineOff) {
			engineOff=false;
		pas.startEngine(this);
		}
	}
	
	public void makeNewVehicle(Vehicle v) {
		
		
	}
	
	public void printVehicleDetails(Vehicle v) {
		
		System.out.println("Model: "+v.getModel()+"\n"+"Type: "+ v.getType()+" \n"+ "Color: "+v.getColor()+"\n"+ "Country of Manufacture: "+v.getCountryOfManufacture());
		
	}

	
	
	
}
