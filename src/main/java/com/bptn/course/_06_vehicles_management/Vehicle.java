package com.bptn.course._06_vehicles_management;

public abstract class Vehicle {
	String make;
	String model;
	int year;
	boolean isEngineOn = false;
	
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayBasicInfo () {
		System.out.println("{ Vehicle = make: \'" + this.make + "\' , model: " + this.model + "year: " + this.year);
	}
	
	public abstract void startEngine();
	
	public abstract void stopEngine();
	
	public abstract void drive();
}
