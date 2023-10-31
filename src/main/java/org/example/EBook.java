package org.example;

public class EBook extends LibraryItem
{
    String format;

    // Constructor for EBook class
    public EBook(int itemID, String title, String format) {
        super(itemID, title);
        this.format = format;
    }

    // Method to display ebook info
    @Override
    public void displayInfo() {
        System.out.println("Type: EBook");
        printItemInfo();
        System.out.println("Format: " + format);
    }

    @Override
    public void checkout() {
        System.out.println("EBook checked out.");
    }

    @Override
    public void returnItem() {
        System.out.println("EBook returned.");
    }
}
