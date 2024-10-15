package org.noushin.examples.string_methods;

import java.util.Scanner;

public class ByteEncoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        byte[] byteArray = convertToBytes(userInput);
//        for (int i = 0; i < userInput.length(); i++) {
//            byte b = byteArray[i];
//            System.out.print(b + " ");
//        }

        for (byte b: byteArray){
            System.out.print(b+" ");
        }
    }

    public static byte[] convertToBytes(String userInput) {
        return userInput.getBytes();
    }
}
