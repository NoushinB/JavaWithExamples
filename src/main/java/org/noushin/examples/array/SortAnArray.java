package org.noushin.examples.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter number " + (i + 1));
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();

    }
}
