package com.bptn.course._05_strings;

import java.util.*;

public class PalindromeChecker {

	public static void main(String[] args) {
		System.out.print("Enter the string to check for palindrome: ");
	       Scanner scanner = new Scanner(System.in);
	       String input = scanner.nextLine();
	       char[] inputArray = input.toCharArray();
 	       String reverseInput = "";
 	       char[] reverseArray = new char[input.length()];
 	       
 	       int count =0;

	       // Fill in the code below to reverse the input string and store it in the reverseInput variable
	       for (int i = input.length() - 1; i >= 0; i--){
	          reverseInput += input.charAt(i);
	          reverseArray[i] = inputArray[count];
	          count ++;
	       }
	       
	       System.out.println(Arrays.toString(reverseArray));
	       
	       // Write the code below to display "Input string is palindrome" or "Input string is not palindrome". 
	       //Note: you'll have to write the logic to make that decision, as well.
	      if (input.toLowerCase().equalsIgnoreCase(reverseInput.toLowerCase())){
	        System.out.println("Input string is palindrome");
	      } else
	        System.out.println("Input string is not palindrome");
	      
	      
//	      System.out.println("Enter the string to check for palindrome: ");
//	       Scanner scanner = new Scanner(System.in);
//	       String input = scanner.nextLine();
//	       String reverseInput = "";
//	       char [] character = input.toCharArray();
//	       
//	       // Fill in the code below to reverse the input string and store it in the reverseInput variable
//	       for(int i=input.length()-1; i>=0; i--){
//	        reverseInput += character[i];
//	       }
//	        System.out.println(reverseInput);
//	       // Write the code below to display "Input string is palindrome" or "Input string is not palindrome". 
//	       //Note: you'll have to write the logic to make that decision, as well.
//	       if(reverseInput.equals(input)){
//	        System.out.println("Input string is palindrome");
//	       }else{
//	        System.out.println("Input string is not palindrome");
	      
//	      System.out.println("Enter the string to check for palindrome: ");
//	       Scanner scanner = new Scanner(System.in);
//	       String input = scanner.nextLine();
//	       //char[] inputArray = input.toCharArray(); 
//	       String reverseInput = "";
//
//	       // Fill in the code below to reverse the input string and store it in the reverseInput variable
//	       for ( int i = input.length()-1; i>=0; i--){
//	     reverseInput = reverseInput + input.charAt(i); 
	      scanner.close();

	}

}
