package org.noushin.examples.array;

public class FinedSmallestElementInArray {
    public static void main(String[] args) {
        int[] array={33,1,55,2,0};
        int small= smallestElement(array);
        System.out.println("Smallest Element is: "+ small );
    }

    public static int smallestElement(int[] array){
        int small=array[0];
        for (int i=0;i<array.length;i++){
            if (small>array[i]){
                small=array[i];
            }
        }

        return small;
    }
}
