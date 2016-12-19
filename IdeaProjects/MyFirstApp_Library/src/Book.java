/**
 * Created by MałaMi on 2016-12-19.
 */
public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String bookTitle, String bookAuthor, int bookRelease, int bookPages, String bookPublisher, String boolIsbn){
        title = bookTitle;
        author = bookAuthor;
        releaseDate = bookRelease;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = boolIsbn;
    }
    void  printInfo(){
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }

}
