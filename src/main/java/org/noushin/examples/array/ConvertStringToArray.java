package org.noushin.examples.array;

import java.util.Scanner;

public class ConvertStringToArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a String: ");
        String inputString = scanner.nextLine();

        char[] array = convertStringToArray(inputString);
    }

    public static char[] convertStringToArray(String inputString) {
        char[] array = inputString.toCharArray();
        for (char i : array) {
            System.out.println(i);
        }
        return array;
    }
}
