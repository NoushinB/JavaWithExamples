package org.noushin.examples;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a integer number: ");
        int digitNumber = scanner.nextInt();

        int sum = sumOfDigits(digitNumber);
        System.out.println("The sum of the digits is: " + sum);


    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
