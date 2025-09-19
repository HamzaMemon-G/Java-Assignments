import java.util.*;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author;
    }
}

public class BookInventory {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Java Basics", "John Doe"));
        bookList.add(new Book(2, "OOP Concepts", "Jane Smith"));
        bookList.add(new Book(3, "Collections Guide", "John Doe"));

        HashMap<Integer, Book> bookMap = new HashMap<>();
        for (Book b : bookList) {
            bookMap.put(b.id, b);
        }

        Set<String> authors = new HashSet<>();
        for (Book b : bookList) {
            authors.add(b.author);
        }

        System.out.println("Book List:");
        for (Book b : bookList) {
            System.out.println(b);
        }

        System.out.println("\nBook by ID 2: " + bookMap.get(2));

        System.out.println("\nUnique Authors:");
        for (String a : authors) {
            System.out.println(a);
        }
    }
}