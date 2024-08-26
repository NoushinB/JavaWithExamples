package org.noushin.examples.fibonacci_series;

import java.util.Scanner;

public class FibonacciSeriesExample {

    public static int[] fibonacciSeries(int length) {
        int[] fib = new int[length];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Fibonacci series:");
        int fibLength = Integer.parseInt(scanner.nextLine());

        int[] fibonacciSeries = fibonacciSeries(fibLength);

        System.out.println("Fibonacci series:");
        for (int f = 0; f < fibLength; f++) {
            System.out.print(fibonacciSeries[f] + " ");
        }
        scanner.close(); // Close the scanner to free resources
    }

}
