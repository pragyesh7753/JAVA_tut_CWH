/**
 * The Java class `Library` models a library system allowing users to add, issue, return books and view
 * available books.
 */

import java.util.Scanner;

class Library {

    String[] availableBooks;
    int noOfBooks;

    Library() {
        System.out.println("Welcome to the Library");
        this.availableBooks = new String[100];
        this.noOfBooks = 0;
    }

    public void addBook(String book) {
        this.availableBooks[noOfBooks] = book;
        noOfBooks++;

    }

    public void issueBook(String book) {
        if (noOfBooks == 0) {
            System.out.println("No Book Available");
        } else {
            for (int i = 0; i < this.availableBooks.length; i++) {
                if (this.availableBooks[i] != null && this.availableBooks[i].equals(book)) {
                    System.out.println("Thank you book '" + book + "' has been issued to you");
                    this.availableBooks[i] = null;
                    noOfBooks--;
                }
            }
        }
    }

    public void returnBook(String book) {
        this.availableBooks[noOfBooks] = book;
        noOfBooks++;
        System.out.println("Book Returned");

    }

    public void showAvailableBooks() {
        if (noOfBooks == 0) {
            System.out.println("No Book Available");
        } else {
            System.out.println("Available Books are: ");
            for (String book : availableBooks) {
                if (book == null) {
                    continue;
                }
                System.out.println("* " + book);

            }
        }
    }

}

public class CWH_51_Exercise4 {

    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        do {
            System.out.println("Enter 1 to add book, 2 to issue book, 3 to return book, 4 to show available books and 5 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("How many books you want to add?");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Enter the name of the book you want to add: ");
                        String book = sc.next();
                        l.addBook(book);
                        System.out.println("Book " + (i) + " Added");
                    }
                }
                case 2 -> {
                    System.out.println("Enter the name of the book you want to issue: ");
                    sc.nextLine();
                    String book = sc.nextLine();
                    l.issueBook(book);
                }
                case 3 -> {
                    System.out.println("Enter the name of the book you want to return: ");
                    sc.nextLine();
                    String book = sc.nextLine();
                    l.returnBook(book);
                }
                case 4 -> {
                    l.showAvailableBooks();
                }
                case 5 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
        } while (true);
    }
}
