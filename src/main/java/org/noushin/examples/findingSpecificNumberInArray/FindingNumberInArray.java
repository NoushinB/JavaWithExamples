package org.noushin.examples.findingSpecificNumberInArray;

import java.util.Scanner;

public class FindingNumberInArray {
    public static boolean findNumber(int[] num,int specificNumber) {


        for (int i = 0; i < num.length; i++) {
            if (num[i] == specificNumber) {
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers of elements in the Array");
        int arrayLength = scanner.nextInt();

        int[] num = new int[arrayLength];
        System.out.println("Please input the array elements");
        for (int i = 0; i < arrayLength; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println("inter a number you want to find");
        int specificNum = scanner.nextInt();

        boolean isFound = findNumber(num, specificNum);

        System.out.println("Is the number in the array?" + isFound);
/*
  int[] num={22,333,2,5};
  int spesificNum=2;
  boolean isFound=findNumber(num,spesificNum);
  System.out.println(isFound);*/


    }
}
