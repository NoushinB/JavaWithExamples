package org.noushin.examples.array;

import java.util.Scanner;

public class LargestElementInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i=0; i<length; i++) {
            System.out.println("Enter number " +( i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int max = findLargestElementInArray(array);
        System.out.println("Largest number is:");
        System.out.println(max);
    }

    public static int findLargestElementInArray(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;

    }
}
