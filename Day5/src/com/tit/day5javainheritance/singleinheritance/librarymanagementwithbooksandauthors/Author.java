package com.tit.day5javainheritance.singleinheritance.librarymanagementwithbooksandauthors;

// Creating Author class and extending Book
class Author extends Book {
    private String name;
    private String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call the superclass constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}
