package org.example;

public class Book extends LibraryItem
{
    String author;

    // Constructor for Book class
    public Book(int itemID, String title, String author) {
        super(itemID, title);
        this.author = author;
    }

    // Method to display book info
    @Override
    public void displayInfo() {
        System.out.println("Type: Book");
        printItemInfo();
        System.out.println("Author: " + author);
    }

    @Override
    public void checkout() {
        System.out.println("Book checked out.");
    }

    @Override
    public void returnItem() {
        System.out.println("Book returned.");
    }
}
