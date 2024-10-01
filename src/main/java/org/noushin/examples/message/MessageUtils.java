package org.noushin.examples.message;

import java.util.Scanner;

public class MessageUtils {
    private String message;
    public MessageUtils(String message){
        this.message=message;
    }


    public String printMessage(){
    if (message==null || message.isEmpty()){
            System.out.println("Message not provided");
            return null;
        }
        System.out.println(message);
        return message;
    }



    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Write a message: ");
            String userMessage=scanner.nextLine();
            MessageUtils messageUtils=new MessageUtils(userMessage);
            messageUtils.printMessage();
            scanner.close();

    }
}
