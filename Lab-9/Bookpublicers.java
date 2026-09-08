//4.Declare a class called book having author_name as private data member. Extend book class to have two sub classes called book_publication 
//  & paper_publication. Each of these classes have private member called title. Write a complete program to show usage of dynamic method dispatch
//  (dynamic polymorphism) to display book or paper publications of given author.
import java.util.Scanner;

class Book{
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    void display() {
        System.out.println("Author: " + author_name);
    }
}
class Book_Publication extends Book {
    private String title;

    Book_Publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println("Book Publication");
        System.out.println("Author: " + getAuthor_name());
        System.out.println("Title: " + title);
    }
}

class Paper_Publication extends Book {
    private String title;

    Paper_Publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println("Paper Publication");
        System.out.println("Author: " + getAuthor_name());
        System.out.println("Title: " + title);
    }
}
public class Bookpublicers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title: ");
        String bookTitle = sc.nextLine();
        System.out.println("Enter the type of publication (book/paper): ");
        String type= sc.nextLine();
        System.out.print("Enter the author: ");
        String author = sc.nextLine();
        Book b;
        if (type.equalsIgnoreCase("book")) {
            b = new Book_Publication(bookTitle, author);
        } else if (type.equalsIgnoreCase("paper")) {
            b = new Paper_Publication(bookTitle, author);
        } else {
            System.out.println("Invalid type of publication.");
            sc.close();
            return;
        }
        b.display();
        sc.close();
    }
}


