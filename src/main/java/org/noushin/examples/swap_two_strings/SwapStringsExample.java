package org.noushin.examples.swap_two_strings;

import java.util.Scanner;

public class SwapStringsExample {

    public static String[] swapString(String inputString1, String inputString2) {
        String temp = inputString1;
        inputString1 = inputString2;
        inputString2 = temp;

        return new String[]{inputString1, inputString2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String inputFirstString = scanner.nextLine();

        System.out.println("Enter a second string:");
        String inputSecondString = scanner.nextLine();

        String[] swappedStrings = swapString(inputFirstString, inputSecondString);

        System.out.println("The first string is: " + swappedStrings[0]);
        System.out.println("The second string is: " + swappedStrings[1]);
    }
}
