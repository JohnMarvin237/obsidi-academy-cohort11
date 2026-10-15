package com.bptn._06_oop_concept._12_;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        boolean swapped;
        do {
            swapped = false;                          // une fois par passage
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);                            // la boucle extérieure
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 3, 5, 8]
    }
}