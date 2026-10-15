package com.bptn._06_oop_concept._12_._junit_test_book;

public class Textbook extends Book {
	   private int edition;

	    // super(title, price) calls the Book constructor;
	    // it must be the first line of the constructor
	    public Textbook(String title, double price, int edition) {
	        super(title, price);
	        this.edition = edition;
	    }

	    // Reuses the result from Book and appends the edition
	    @Override
	    public String getBookInfo() {
	        return super.getBookInfo() + "-" + edition;
	    }

	    public int getEdition() {
	        return edition;
	    }

	    // Can replace the other textbook if it has the same title AND an edition at least as recent
	    public boolean canSubstituteFor(Textbook other) {
	        return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
	    }
	}