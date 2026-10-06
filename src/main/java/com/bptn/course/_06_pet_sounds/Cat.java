package com.bptn.course._06_pet_sounds;

public class Cat extends Pet{
	public Cat(String name, String type) {
		this.setName(name);
		this.setType(type);
	}
	
	@Override
	public void speak() {
		System.out.println("Meow!");
	}
}
