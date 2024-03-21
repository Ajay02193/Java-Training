/*Create a Book class with bookId, bookName and authorName.
Create parameterized constructor to initialize the object.
Create an ArrayList of type Book and store all book objects into collections and display all book details.
[Hint:Use advanced for loop to display all Books details]*/

import java.util.ArrayList;

public class BookData {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList();
        Book b1 = new Book(101,"let us C","Yashvant P Kanetkar");
        books.add(b1);
        Book b2 = new Book(102,"head first java","Kathy Sierra");
        books.add(b2);

        System.out.println("Book Details: ");
        for(Book book : books){
            System.out.println(book);
        }
    }
}
