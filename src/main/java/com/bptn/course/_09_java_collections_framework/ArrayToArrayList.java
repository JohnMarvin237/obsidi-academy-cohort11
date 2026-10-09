package com.bptn.course._09_java_collections_framework;

import java.util.List;
import java.util.ArrayList;

public class ArrayToArrayList {
	// Complete the functionality of the method below
    public static  List<String> convertArrayToList(String[] inputArray) {
        
        // Create a new ArrayList of String. 
      ArrayList<String> stringList = new ArrayList<>();
        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.
      for(String input : inputArray){
        stringList.add(input);
      }
        // return the new list with elements.
      return stringList;
    }
 
   
    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
    }
}
