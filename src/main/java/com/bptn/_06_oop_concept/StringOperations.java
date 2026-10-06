package com.bptn._06_oop_concept;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int count=0;

        do{
          if (count == 0){
            System.out.print("Press 1 for Palindrome Check\nPress 2 to Reverse a String\nPress 3 for String Comparison\nEnter your selection: ");
          choice = scanner.nextInt();
          scanner.nextLine();
          } else{
            System.out.print("Invalid choice! Please make a valid choice!\nPress 1 for Palindrome Check\nPress 2 to Reverse a String\nPress 3 for String Comparison\nEnter your selection: ");
          choice = scanner.nextInt();
          scanner.nextLine();
          }
          
          count++;
          

        }while(choice != 1 && choice != 2 && choice != 3);
        if (choice == 1){
          System.out.print("Enter a String: ");
          String input = scanner.nextLine();
          isPalindrome(input);
        } else if(choice == 2){
          System.out.print("Enter a String: ");
          String input = scanner.nextLine();
          reverseString(input);
        } else if(choice == 3){
          System.out.print("Enter the first String: ");
          String input1 = scanner.nextLine();
          System.out.print("Enter the second String: ");
          String input2 = scanner.nextLine();
          StringComparison(input1, input2);
        }
        scanner.close();
    }

    public static void isPalindrome(String input){
      char [] character = input.toCharArray(); // array declaration to create a new string for comparison
      String reverseInput ="";
      for(int i=input.length()-1; i>=0; i--){
	           reverseInput += character[i];
	    }
      if(reverseInput.equals(input)){
	           System.out.println(input+" is palindrome");
	    } else{
	           System.out.println(input + " is not palindrome");
	    }

    }

    public static void reverseString(String input){
      char [] character = input.toCharArray(); // create an array to store the value after reverse
      String reverseWord ="";
      
      for(int i=input.length() - 1; i>=0 ; i--){
	           reverseWord += character[i];
	    }

      System.out.println(input + " reversed is " + reverseWord);
    }

    public static void StringComparison (String input1, String input2){
      if(input1.equalsIgnoreCase(input2)){
        System.out.println("The entered strings are equal.");
      } else {
        System.out.println("The entered strings are not equal.");
      }
    }
}
