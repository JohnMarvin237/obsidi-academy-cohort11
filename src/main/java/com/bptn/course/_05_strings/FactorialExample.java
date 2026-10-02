package com.bptn.course._05_strings;


 public class FactorialExample {  
 public static void main(String args[]){  
        int number = 5; // input declaration
        double fact = 1; // factorial result 
        if(number == 0) // give value 1 of 0!
          fact = 1;
        
        // Specify that factorial doesn't exist for negative number
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        // The loop to make the multiplication between each number till 2 because 1 * number is always the number
        for (int i = number; i >= 2; i--){
          fact *= i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}