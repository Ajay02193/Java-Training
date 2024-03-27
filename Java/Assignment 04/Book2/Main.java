/*Create a Book class with bookId, bookName and authorName.
Create parameterized constructor to initialize the object.
Create an ArrayList of type Book and store all book objects into collections and display all book details.
[Hint:Use advanced for loop to display all Books details]*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book2> books=new ArrayList();
        Book2 b21 = new Book2(101,"let us C","Yashvant P Kanetkar");
        books.add(b21);
        Book2 b22=new Book2(102,"head first java","Kathy Sierra");
        books.add(b22);

        System.out.println("Book Details: ");
        for(Book2 book : books){
            System.out.println("bookId: "+book.getbookId()+" | bookName: "+book.getBookName()+" | authorName: "+book.getAuthorName());
        }
    }
}