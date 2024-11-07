package org.noushin.examples;

import java.util.Scanner;

public class CountNumberOfWords {


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please inter a sentence : ");
        String sentence=scanner.nextLine();

        int countWords=sentence.split("\\s").length;

        System.out.println("The number of words is: "+ countWords);

    }

}
