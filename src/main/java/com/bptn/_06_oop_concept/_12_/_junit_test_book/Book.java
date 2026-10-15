package com.bptn._06_oop_concept._12_._junit_test_book;

public class Book {
	   // Private instance variables: only Book can access them directly
	    private String title;
	    private double price;

	    // Constructor: "this" distinguishes the object's field from the parameter with the same name
	    public Book(String title, double price) {
	        this.title = title;
	        this.price = price;
	    }

	    public String getTitle() {
	        return title;
	    }

	    // Combines the title and the price, separated by a hyphen
	    public String getBookInfo() {
	        return title + "-" + price;
	    }
	}