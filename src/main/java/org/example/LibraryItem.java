package org.example;

abstract class LibraryItem implements Borrowable
{
    int itemID;
    String title;

    // Constructor for LibraryItem class
    public LibraryItem(int itemID, String title)
    {
        this.itemID = itemID;
        this.title = title;
    }
    // Concrete method to print item info
    public void printItemInfo() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Title: " + title);
    }

    // Abstract method to display item info
    public abstract void displayInfo();
}
