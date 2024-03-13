/*Create a Book class with bookId, bookName and authorName.
Create parameterized constructor to initialize the object.
Create an ArrayList of type Book and store all book objects into collections and display all book details.
[Hint:Use advanced for loop to display all Books details]*/

import java.util.ArrayList;

public class BookData {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList();

        books.add(new Book(101,"let us C","Yashvant P Kanetkar"));
        books.add(new Book(102,"head first java","Kathy Sierra"));

        System.out.println("Book Details: ");
        for(Book book : books){
            System.out.println("bookId: "+book.getbookId()+" | bookName: "+book.getBookName()+" | authorName: "+book.getAuthorName());
        }
    }
}
