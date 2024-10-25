package org.noushin.examples.prime_number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int num = scanner.nextInt();

        boolean isPrim = checkPrimeNumber(num);
        if (isPrim == false) {
            System.out.println("The input number is not a prime number");
        } else {
            System.out.println("The input number is a prime number");
        }


    }

    public static boolean checkPrimeNumber(int inputNumber) {
        for (int i = 2; i < inputNumber; i++) {

            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
