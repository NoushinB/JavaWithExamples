package org.noushin.examples.sum_of_digits;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void  main(String[] args){



        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input first number");
        int firstNumber= scanner.nextInt();
        System.out.println("Please input second number");

        int secondNumber= scanner.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("The sum of firstNumber and second number is:" + sum);
    }
}
