package org.noushin.examples.string_methods;

import java.util.Scanner;

public class CharUnicode {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput=scanner.nextLine();
        System.out.println("Enter an index: ");
        int index=scanner.nextInt();
        int unicode=findCharUnicode(index,userInput);
        System.out.println("The Unicode of char in index ("+index+") is: "+ unicode );

        int unicodeBefore= findCodePointBefore(index,userInput);
        System.out.println("The Unicode of char before index ("+index+") is: "+ unicodeBefore );


    }
    public static int findCharUnicode(int index, String userInput){

        return (userInput.codePointAt(index));

    }
    public static int findCodePointBefore(int index, String userInput){
        return (userInput.codePointBefore(index));
    }
}
