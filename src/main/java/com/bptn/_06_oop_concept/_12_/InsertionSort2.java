package com.bptn._06_oop_concept._12_;

public class InsertionSort2 {
    // This method sorts an array in ascending order using insertion sort algorithm
    public static void insertionSort2(int[] arr) {
    	
    	// Check if the array is null or has less than 1 element
        if (arr == null || arr.length < 1) {
            // Return if the array is null or has less than 1 element
            return;
        }
        // Loop through the array starting from index 1 to length of the array
        for (int i = 1; i < arr.length; i++) {
            // Store the current element
            int current = arr[i];
            // Initialize j with i - 1
           int j = i -1;
            // Inner loop to compare current element with elements before it in the array
            while (j >= 0 && current < arr[j]) {
                // Shift the element to the right
                arr[j + 1] = arr[j];
                // Decrement j to compare with next element
               j--;
            }
            // Insert the current element at its correct position
            arr[j + 1] = current;
        }
    }
    // FREEZE CODE BEGIN
  //Do not modify below code
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {3, 4, 1, -2, 4, 8};
        // Call the sort method to sort the array
        insertionSort2(arr);
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // FREEZE CODE END
}
