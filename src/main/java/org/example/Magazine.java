package org.example;

public class Magazine extends LibraryItem
{
    String publicationDate;

    // Constructor for Magazine class
    public Magazine(int itemID, String title, String publicationDate) {
        super(itemID, title);
        this.publicationDate = publicationDate;
    }

    // Method to display magazine info
    @Override
    public void displayInfo() {
        System.out.println("Type: Magazine");
        printItemInfo();
        System.out.println("Publication Date: " + publicationDate);
    }

    @Override
    public void checkout() {
        System.out.println("Magazine checked out.");
    }

    @Override
    public void returnItem() {
        System.out.println("Magazine returned.");
    }
}
