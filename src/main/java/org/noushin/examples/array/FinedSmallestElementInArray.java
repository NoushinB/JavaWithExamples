package org.noushin.examples.array;

public class FinedSmallestElementInArray {
    public static void main(String[] args) {
        int[] array={33,1,55,2,0};
        int small=array[0];
        for (int i=0;i<array.length;i++){
            if (small>array[i]){
                small=array[i];
            }


        }
        System.out.println("Smallest Element is: "+ small );
    }
}
