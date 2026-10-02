package com.bptn.course._03_scanner_user_input;

import java.util.*;

public class UserScanner {

	public static void main(String[] args) {
		String userName;
		// FREEZE CODE END
		Scanner myObj = new Scanner(System.in);
		        // Ask the user to enter the username by printing "Enter Username" and read the input given by the user
		        // Fill in the code for the above part below
		        System.out.print("Please type your Username: ");
		        userName = myObj.nextLine();
		      
		// FREEZE CODE BEGIN        
		        // Print the username   
		        System.out.println("Username is: " + userName);
		        
		        myObj.close();

	}

}
