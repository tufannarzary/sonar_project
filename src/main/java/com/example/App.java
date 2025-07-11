package com.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        System.out.println("Welcome to the long-running Java application for SonarQube analysis.");
        List<String> data = generateSampleData();
        Map<String, Integer> frequencies = calculateFrequencies(data);
        displayFrequencies(frequencies);
    }

    private List<String> generateSampleData() {
        List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana", "apple", "kiwi", "banana", "kiwi", "grape", "grape"
        );
        System.out.println("Generated sample data: " + words);
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
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public void printFibonacci(int count) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
