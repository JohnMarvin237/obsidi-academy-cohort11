package com.bptn.course._10_sets_maps;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashSetManipulation {

	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C
		Set<String> mySet = new LinkedHashSet<>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");

		// Print the size of the set
		System.out.println("Set size: " + mySet.size());
		

		// Use for each loop to print the elements in the set
		System.out.println("Elements in the set (using for-each loop):");
		
		for(String item: mySet) {
			System.out.println("Element: " + item);
		}		

		// Use iterator to print the elements in the set
		System.out.println("Elements in the set (using iterator):");
		Iterator<String> mySetIterator = mySet.iterator();
		
		while(mySetIterator.hasNext()) {
			System.out.println("Element: " + mySetIterator.next());
		}		

		// Use remove() method to remove the element A from the set
		mySet.remove("A");
		System.out.println("Set after using remove():" + mySet);
		
        
		// Use contains() method to check if the element B exists in the set
		if(mySet.contains("B")) {
			System.out.println("Element 'B' exists in the set.");
		}
	

		// Use clear() method to remove all elements from the set
		mySet.clear();
		

        // Print the set to show that it is empty.

		System.out.println("Set after using clear():" + mySet);
	}
}

