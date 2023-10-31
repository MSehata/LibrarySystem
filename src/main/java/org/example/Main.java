package org.example;

public class Main {
    public static void main(String[] args)
    {
        // Create instances of LibraryItems
        Book book = new Book(101, "How to Say NO in a polite way", "Moloko Sehata");
        Magazine magazine = new Magazine(201, "World Rugby Champions", "October 2023");
        EBook eBook = new EBook(301, "Rich Dad, Poor Dad", "PDF");

        // Display information about the items
        book.displayInfo();
        System.out.println();
        magazine.displayInfo();
        System.out.println();
        eBook.displayInfo();
        System.out.println();

        // Checking out and returning an item
        book.checkout();
        book.returnItem();
    }
}