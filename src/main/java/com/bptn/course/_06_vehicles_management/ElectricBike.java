package com.bptn.course._06_vehicles_management;

public class ElectricBike extends Vehicle implements ElectricPowered {
	double batteryLevel = 75.0;
	
	public ElectricBike (String make, String model, int year) {
		super(make, model, year);
	}
	
    @Override
    public void startEngine(){
      this.isEngineOn = true;
      System.out.println("Your bike is already start!");
    }

    @Override
    public void stopEngine(){
      this.isEngineOn = false;
      System.out.println("Your bike is not started!");
    }

    @Override
    public void drive(){
      if (this.isEngineOn == true){
        System.out.println("Your bike is still driving!");
      }
    }

    @Override
    public double charge(double kwh){
      return this.batteryLevel += kwh;
    }

    @Override
    public double getBatteryLevel(){
      return this.batteryLevel;
    }
    
    public String toString() {
		return "make: \'" + this.make + "\', model: \'" + this.model + "\', year: \'" + this.year + "\' battery level: \'" + this.batteryLevel + "\'.";
	}
}
