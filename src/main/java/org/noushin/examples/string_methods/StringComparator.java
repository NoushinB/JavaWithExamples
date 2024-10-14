package org.noushin.examples.string_methods;

import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first string: ");
        String firstString=scanner.nextLine();
        System.out.println("Please enter second string: ");
        String secondString=scanner.nextLine();

        int result=checkStringsEquality(firstString,secondString);
        if (result==0){
            System.out.println("The strings are equal.");

        }
        else System.out.println("The strings are not equal.");

        System.out.println(firstString.concat(secondString));
        System.out.println(firstString.contains("Nou"));
        System.out.println(firstString.contentEquals(secondString));
    }
    public  static int checkStringsEquality(String firstString,String secondString){
        return firstString.compareTo(secondString);
    }
}


