package com.bptn.course._06_vehicles_management;

public class VehicleManager {

	public static void main(String[] args) {
		Car myCar = new Car ("Honda", "Civic", 2023);
		myCar.startEngine();
		myCar.drive();
		myCar.reFuel(45);
		myCar.getFuelLevel();
		myCar.stopEngine();

		ElectricBike myBike = new ElectricBike("Trek", "E-Caliber", 2024);
		myBike.startEngine();
		myBike.drive();
		myBike.charge(55);
		myBike.getBatteryLevel();
		myBike.stopEngine();
		
		System.out.println(myCar);
		System.out.println(myBike);

	}

}
