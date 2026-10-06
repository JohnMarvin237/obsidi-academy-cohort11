package com.bptn.course.polymorphism;

class Shape {
	void draw() {
        System.out.println("Drawing a shape");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        
        s1.draw();
        s2.draw();
        s3.draw();
        
        Animal animal = new Dog();
        animal.makeSound(); // Output: Woof

        animal = new Cat();
        animal.makeSound(); // Output: Meow
        
        Driver d = new Driver();
        d.drive(new Car());
        d.drive(new Bike());
        d.drive(new Bus());
    }
}

class Animal {
	  public void makeSound() {
	    System.out.println("Some animal sound");
	  }
	}

	class Dog extends Animal {
	  @Override
	  public void makeSound() {
	    System.out.println("Woof");
	  }
	}

	class Cat extends Animal {
	  @Override
	  public void makeSound() {
	    System.out.println("Meow");
	  }
	}


	abstract class Vehicle {
	    
	    abstract void start();
	    
	    void stop() {
	        System.out.println("Stopping the vehicle");
	    }
	}

	class Car extends Vehicle {
	    
	    @Override
	    void start() {
	        System.out.println("Starting the car engine");
	    }
	}

	class Bike extends Vehicle {
	    @Override
	    void start() {
	        System.out.println("Kick starting the bike");
	    }
	}

	class Bus extends Vehicle {
	    @Override
	    void start() {
	        System.out.println("Turning on the ignition of the bus");
	    }
	}

	class Driver {
	    void drive(Vehicle v) {
	        v.start();
	        v.stop();
	    }
	}