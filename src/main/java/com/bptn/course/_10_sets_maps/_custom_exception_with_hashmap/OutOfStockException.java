package com.bptn.course._10_sets_maps._custom_exception_with_hashmap;

//Customized Exception Class for when a product is out of stock

public class OutOfStockException extends Exception {
 
 private static final long serialVersionUID = 1L;

 // Modify the constructor below to take a String message parameter.   
 public OutOfStockException(String message) {
     // Call the superclass constructor passing the message parameter.
	 super(message);
 }
}
