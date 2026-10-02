package com.bptn.course._05_strings;

import java.util.Scanner;

public class PalindromeChecker2 {

	public static void main(String[] args) {
		System.out.print("Enter the string to check for palindrome: ");
	    Scanner scanner = new Scanner(System.in);
	    String input = scanner.nextLine();
	    String reverseInput ="";
	    
	    for (int i = input.length() - 1;  i >= 0; i--) {
	    	reverseInput += input.charAt(i);
	    }
	    
	    if(input.compareTo(reverseInput) == 0) {
	    	System.out.println("Input string is palindrome");
	    } else 
	    	System.out.println("Input string is not palindrome");
	    scanner.close();

	}

}
