package org.noushin.examples.sum_of_digits;

import java.util.Scanner;

public class Sum {
    public static void main(String[]args){
        int x,y,sum;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input first number");
        x=scanner.nextInt();

        System.out.println("Input second number");
        y=scanner.nextInt();

        sum=x+y;
        System.out.println("the sum is:"+ sum);
    }
}
