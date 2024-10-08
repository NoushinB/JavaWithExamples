package org.noushin.examples.string_methods;

import java.util.Scanner;

public class CharFinder {
    public static char findCharacterAtIndex(String inputString, int index) {
        return inputString.charAt(index);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("Enter an index: ");
        int index = Integer.parseInt(scanner.nextLine());

        char specificChar = findCharacterAtIndex(userInput, index);
        System.out.println("The character at index " + index + " is: " + specificChar);

    }


}
