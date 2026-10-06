package com.bptn.course._06_vehicles_management;

public class Car extends Vehicle implements FuelConsuming{
	double fuelLevel = 50.0;
	
	public Car(String make, String model, int year) {
		super(make, model, year);
	}
	
	@Override 
	public void startEngine() {
		this.isEngineOn = true;
	};
	
	@Override
	public void stopEngine() {
		this.isEngineOn = false;
	}
	
	@Override
	public void drive() {
		if(this.isEngineOn == true) {
			System.out.println("You can drive your car.");
		}
	}
	
	public double reFuel(double liters) {
		System.out.println("The vehicle is refueling with" + liters + "L of kereosene.");
		return fuelLevel += liters;
	}
	public double getFuelLevel() {
		return fuelLevel;
	}
	
	public Car(String make, String model, int year, double fuelLevel) {
		super(make, model, year); 
		this.fuelLevel = fuelLevel;
	}
	
	public String toString() {
		return "make: \'" + this.make + "\', model: \'" + this.model + "\', year: \'" + this.year + "\', fuel level: \'" + this.fuelLevel + "\'.";
	}
	
}
