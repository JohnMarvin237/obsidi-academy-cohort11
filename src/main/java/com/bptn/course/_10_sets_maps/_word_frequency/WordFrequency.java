package com.bptn.course._10_sets_maps._word_frequency;

import java.util.Map;
import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "This is a test sentence with no repeating words";

        // Split the sentence into words using split() method
        String[] word = sentence.split(" ");

        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Iterate through each word in the sentence
        for (int i = 0; i < word.length; i++ ) {
            // If the word is already in the map, increment its frequency 
            if (wordFrequency.containsKey(word[i])) {
                wordFrequency.put(word[i], wordFrequency.get(word[i]) + 1);
            }
            // If the word is not in the map, add it with a frequency of 1
            else {
               wordFrequency.put(word[i], 1);
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }
}