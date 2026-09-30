package com.bptn.course._03_scanner_user_input;

import java.util.*;

public class ASCIIExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Please type your letter: ");
	    char c = scanner.next().charAt(0);
	    
	    int ascii = c;
	    System.out.println("The ASCII value of " + c + " is: " + ascii);

	    // output: The ASCII value of A is: 65
	    scanner.close();
	}
}
