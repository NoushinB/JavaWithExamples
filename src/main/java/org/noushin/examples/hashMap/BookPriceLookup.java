package org.noushin.examples.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class BookPriceLookup {
    public static void main(String[] args) {
        // Create a HashMap to store book titles and prices
        HashMap<String, Double> bookPrices = new HashMap<>();

        // Adding books to the HashMap
        bookPrices.put("Java Programming", 29.99);
        bookPrices.put("Python Basics", 24.99);
        bookPrices.put("Data Structures", 39.99);

        // Prompt user for a book title and display its price
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a book title to find its price: ");
        String bookTitle = scanner.nextLine();

        // Check if the book is in the HashMap
        if (bookPrices.containsKey(bookTitle)) {
            System.out.println("The price of '" + bookTitle + "' is $" + bookPrices.get(bookTitle));
        } else {
            System.out.println("Book not found.");
        }

        scanner.close();
    }
}