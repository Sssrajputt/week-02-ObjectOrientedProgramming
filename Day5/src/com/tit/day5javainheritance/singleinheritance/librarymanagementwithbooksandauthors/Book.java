package com.tit.day5javainheritance.singleinheritance.librarymanagementwithbooksandauthors;


    // Creating Book class
    class Book {
        private String title;
        private int publicationYear;

        Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }

        void displayInfo() {
            System.out.println("Book Title: " + title);
            System.out.println("Publication Year: " + publicationYear);
        }
    }