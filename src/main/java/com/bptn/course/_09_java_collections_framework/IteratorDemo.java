package com.bptn.course._09_java_collections_framework;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		  
	    // Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	  
	    // Get the iterator
	    Iterator<String> it = cars.iterator();
	    
	    System.out.println("Java iterator with While Loop");
	    
//	    Loop with iterator to print a collection
	 // Print the first item
	    System.out.println(it.next());
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
	    System.out.println("For-Loop");
//	    for each loop
	    for(String car: cars) {
	    	System.out.println(car);
	    }
	  }
}
