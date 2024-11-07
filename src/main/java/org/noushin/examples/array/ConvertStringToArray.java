package org.noushin.examples.array;

import java.util.Scanner;

public class ConvertStringToArray {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input a String: ");
        String inputString=scanner.nextLine();

        char[] array=inputString.toCharArray();
         for (char i:array){
             System.out.println(i);
         }
        System.out.println("Also we can use this way: ");
         for (int i=0;i< array.length;i++){
             System.out.println(array[i]);

         }


    }
}
