package com.techelevator;

/**
 * Bookstore
 */
public class Bookstore {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        // Step Three: Test the getters and setters
        Book twoCities = new Book("Harry Potter","J.K. Rowling", 10.99);

        System.out.println("Title: " + twoCities.getTitle() + ", Author: " + twoCities.getAuthor() + ", Price: $" + twoCities.getPrice());
        twoCities.setPrice(11.00);
        System.out.println("Title: " + twoCities.getTitle() + ", Author: " + twoCities.getAuthor() + ", Price: $" + twoCities.getPrice());
        // Step Five: Test the Book constructor
        Book threeMusketeers = new Book("The Three Musketeers", "Alexandre Dumas", 12.95);

        Book childhoodEnd = new Book("Childhood's End", "Arthur C. Clark", 5.99);

        System.out.println("Title: " + threeMusketeers.getTitle() + ", Author: " + threeMusketeers.getAuthor() + ", Price: $" + threeMusketeers.getPrice());

        System.out.println("Title: " + childhoodEnd.getTitle() + ", Author: " + childhoodEnd.getAuthor() + ", Price: $" + childhoodEnd.getPrice());
        System.out.println(twoCities.bookInfo());
        // Step Nine: Test the ShoppingCart class
        System.out.println(threeMusketeers.bookInfo());
        System.out.println(childhoodEnd.bookInfo());
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(twoCities);
        shoppingCart.add(threeMusketeers);
        shoppingCart.add(childhoodEnd);
        System.out.println(shoppingCart.receipt());
    }
}