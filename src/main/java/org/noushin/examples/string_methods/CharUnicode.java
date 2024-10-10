package org.noushin.examples.string_methods;

import java.util.Scanner;

public class CharUnicode {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("Enter an index: ");
        int index = scanner.nextInt();
        System.out.println("Enter an end index:");
        int endIndex=scanner.nextInt();
        int unicode = findCharUnicode(index, userInput);
        System.out.println("The Unicode of char in index (" + index + ") is: " + unicode);

        int unicodeBefore = findCodePointBefore(index, userInput);
        System.out.println("The Unicode of char before index (" + index + ") is: " + unicodeBefore);


        int numberOfUnicodValue= findCountNumberOfUnicodeValue(index,endIndex,userInput);
        System.out.println("The number of Unicode values is: "+numberOfUnicodValue);



    }

    public static int findCharUnicode(int index, String userInput) {

        return (userInput.codePointAt(index));

    }

    public static int findCodePointBefore(int index, String userInput) {
        return (userInput.codePointBefore(index));
    }

    public static int findCountNumberOfUnicodeValue(int beginIndex, int endIndex, String userInput) {
        return (userInput.codePointCount(beginIndex, endIndex));
    }
}
