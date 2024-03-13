/*Create a Book class with bookId, bookName and authorName.
Create parameterized constructor to initialize the object.
Create an ArrayList of type Book and store all book objects into collections and display all book details.
[Hint:Use advanced for loop to display all Books details]*/

import java.util.ArrayList;

public class BookData {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList();

        books.add(new Book(101,"Harry Potter","J.K.Rowling"));
        books.add(new Book(102,"The Great Gatsby","F. Scott Fitzgerald"));
        books.add(new Book(103,"The Hobbit","J.R.R. Tolkien"));
        books.add(new Book(104,"The Grapes of Wrath","John Steinbeck"));
        books.add(new Book(105,"Lord of the Flies","William Golding"));

        System.out.println("Book Details: ");
        for(Book book : books){
            System.out.println("bookId: "+book.getbookId()+" | bookName: "+book.getBookName()+" | authorName: "+book.getAuthorName());
        }
    }
}
