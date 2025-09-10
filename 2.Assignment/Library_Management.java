// Filename: Library_Management.java
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    boolean isIssued;

    // Constructor
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false; // initially not issued
    }

    // Issue the book
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book \"" + title + "\" has been issued.");
        } else {
            System.out.println("Book \"" + title + "\" is already issued.");
        }
    }

    // Return the book
    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book \"" + title + "\" has been returned.");
        } else {
            System.out.println("Book \"" + title + "\" was not issued.");
        }
    }

    // Display book information
    void displayInfo() {
        System.out.println("ID: " + id + ", Title: " + title +
                ", Author: " + author +
                ", Issued: " + (isIssued ? "Yes" : "No"));
    }
}

class Library {
    Book[] books;

    // Constructor
    Library(Book[] books) {
        this.books = books;
    }

    // Show all available (not issued) books
    void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            if (!b.isIssued) {
                b.displayInfo();
            }
        }
    }
}

public class Library_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create 5 books with user input
        Book[] allBooks = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();

            allBooks[i] = new Book(id, title, author);
        }

        // Step 2: Add books to the library
        Library library = new Library(allBooks);

        // Step 3: Issue 2 books (by ID entered by user)
        System.out.println("\nEnter ID of first book to issue: ");
        int id1 = sc.nextInt();
        System.out.println("Enter ID of second book to issue: ");
        int id2 = sc.nextInt();

        for (Book b : allBooks) {
            if (b.id == id1 || b.id == id2) {
                b.issueBook();
            }
        }

        // Step 4: Show available books
        library.showAvailableBooks();

        sc.close();
    }
}
