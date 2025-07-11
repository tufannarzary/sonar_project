package com.example;

import java.util.*;
import java.util.logging.Logger;

class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    // Repeated literals defined as constants
    private static final String APPLE = "apple";
    private static final String BANANA = "banana";
    private static final String ORANGE = "orange";
    private static final String KIWI = "kiwi";
    private static final String GRAPE = "grape";

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    void run() {
        logger.info("Welcome to the long-running Java application for SonarQube analysis.");

        List<String> data = generateSampleData();
        Map<String, Integer> frequencies = calculateFrequencies(data);
        displayFrequencies(frequencies);
    }

    private List<String> generateSampleData() {
        List<String> words = Arrays.asList(
            APPLE, BANANA,
            APPLE, ORANGE, BANANA,
            APPLE, KIWI, BANANA, KIWI, GRAPE, GRAPE
        );
        logger.info("Generated sample data: " + words);
        return words;
    }

    private Map<String, Integer> calculateFrequencies(List<String> data) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : data) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }

    private void displayFrequencies(Map<String, Integer> frequencies) {
        logger.info("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            logger.info(entry.getKey() + ": " + entry.getValue());
        }
    }

    int add(int a, int b) {
        return a + b;
    }

    int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    void printFibonacci(int count) {
        int a = 0;
        int b = 1;

        StringBuilder sb = new StringBuilder("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            sb.append(a).append(" ");
            int next = a + b;
            a = b;
            b = next;
        }

        logger.info(sb.toString());
    }
}
