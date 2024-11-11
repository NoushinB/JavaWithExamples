package org.noushin.examples.array;

public class BiggestElement {
    public static void main(String[]args){
        int[] array={22,34,76,3,46};
        int bigElement=array[0];

        for (int i=0;i<array.length;i++){
            if(bigElement<array[i]){
                bigElement=array[i];
            }
        }
        System.out.println("The Biggest Element is: "+ bigElement);
    }


}
