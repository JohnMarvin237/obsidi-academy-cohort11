package com.bptn.course_oop_concept.pay;

public class Person {

	private String name;

    public Person(String name) {
        this.name = name; // Using "this" to refer to the instance variable
    }

    public void introduce() {
        System.out.println("Hi, my name is " + this.name); // Using "this" to refer to the instance variable
    }

    // Main method for Testing
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John Doe");

        // Call the introduce method to print the person's name
        person.introduce();
    }

}
