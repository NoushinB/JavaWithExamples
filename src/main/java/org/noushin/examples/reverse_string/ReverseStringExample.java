package org.noushin.examples.reverse_string;

import java.util.Scanner;

public class ReverseStringExample {

    public static String reverseString(String input) {
        StringBuilder result = new StringBuilder();  // Instead of result += input.charAt(i)
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a string:");

        String inputString = scanner.nextLine();  // Read user input
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string is: " + reversedString);  // Print reversed string
    }
}
