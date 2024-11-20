package org.noushin.examples.array;

import java.util.Scanner;

public class SumOfAnArray {


    public static int sumOfArray(int[] array) {
        int sumArray = 0;
        for (int j = 0; j < array.length; j++) {
            sumArray += array[j];

        }
        return sumArray;
    }


    public static void main(String[] args){
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Please input number of Array items");
        int arrayItem=scanner.nextInt();
        System.out.println("Array items");
        int[] array= new int[arrayItem];
        for(int i=0;i<arrayItem; i++){
            System.out.println("Please input Array items index "+ i);
            array[i]=scanner.nextInt();

        }
        System.out.println("Array items are: "+array);*/

        int[] array={3,4,7};
        int sumArray=sumOfArray(array);


        System.out.println(sumArray);

    }
}
