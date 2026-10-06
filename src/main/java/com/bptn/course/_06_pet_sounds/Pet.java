package com.bptn.course._06_pet_sounds;

public abstract class Pet {
	private String name;
	private String type;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public abstract void speak();
}
