package com.ibm.core.java.lab4.ex3;

public class LibraryDemo {

    public static void main(String[] args) {

        Book book =
                new Book(101,
                        "Java Programming",
                        10,
                        "James Gosling");

        JournalPaper journal =
                new JournalPaper(102,
                        "AI Research",
                        5,
                        "Andrew Ng",
                        2024);

        Video video =
                new Video(103,
                        "Inception",
                        4,
                        148,
                        "Christopher Nolan",
                        "Sci-Fi",
                        2010);

        CD cd =
                new CD(104,
                        "Greatest Hits",
                        7,
                        60,
                        "Arijit Singh",
                        "Music");

        book.print();
        journal.print();
        video.print();
        cd.print();

        System.out.println("\nChecking out a book...");
        book.checkOut();

        System.out.println("Copies after checkout: "
                + book.getNumberOfCopies());

        System.out.println("\nChecking in a book...");
        book.checkIn();

        System.out.println("Copies after checkin: "
                + book.getNumberOfCopies());
    }
}