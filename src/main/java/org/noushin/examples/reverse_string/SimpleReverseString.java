package org.noushin.examples.reverse_string;

public class SimpleReverseString {
    public static void main(String[] args) {
        String myString="Noushin";
        String reverseString="";
        for(int i=myString.length()-1;i>=0;i--){

            reverseString+=myString.charAt(i);
        }
        System.out.println(reverseString);

        /*String originalStr="Noushin";
        String reverseString="";
        for (int i=0;i<originalStr.length();i++){
            reverseString=originalStr.charAt(i)+reverseString;

        }
        System.out.println(reverseString);*/
    }
}
