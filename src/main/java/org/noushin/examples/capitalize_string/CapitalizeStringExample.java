package org.noushin.examples.capitalize_string;

import java.util.Scanner;

public class CapitalizeStringExample {

    public static String capitalizeString(String input) {
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a string:");

        String inputString = scanner.nextLine();
        String capitalizeString = capitalizeString(inputString);
        System.out.println("Capitalize string is: " + capitalizeString);
    }
}
