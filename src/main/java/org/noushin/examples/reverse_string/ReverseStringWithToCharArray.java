package org.noushin.examples.reverse_string;

import java.util.Scanner;

public class ReverseStringWithToCharArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userInput=scanner.nextLine();

        String reverseString=reverseStringWithToCharArray(userInput);
        System.out.println(reverseString);


    }

    public static String reverseStringWithToCharArray(String userInput){
             char[]  myArray=userInput.toCharArray();
             String reversString="";
        for (int i=userInput.length()-1;i>=0;i--){
           reversString+=myArray[i];
        }
        return reversString;

    }

}
