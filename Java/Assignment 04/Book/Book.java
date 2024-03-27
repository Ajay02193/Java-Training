public class Book {
    int bookId;
    String bookName,authorName;

    Book(int bookId,String bookName,String authorName){
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String toString(){
        return ("bookId: "+bookId+" | bookName: "+bookName+" | authorName: "+authorName);
    }
//    int getbookId(){
//        return bookId;
//    }
//
//    String getBookName(){
//        return bookName;
//    }
//
//    String getAuthorName(){
//        return authorName;
//    }
}
