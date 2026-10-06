package com.bptn.course._06_pet_sounds;

public class Dog extends Pet{
	public Dog(String name, String type) {
		this.setName(name);
		this.setType(type);
	}
	
	@Override
	public void speak() {
		System.out.println("Woof!");
	}
}
