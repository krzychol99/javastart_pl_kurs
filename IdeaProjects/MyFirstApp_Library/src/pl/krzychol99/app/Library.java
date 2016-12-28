package pl.krzychol99.app;

import pl.krzychol99.data.Book;

/**
 * Created by MałaMi on 2016-12-18.
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";
        Book [] books = new Book[1000];
        books[0] = new Book("Ogniem i mieczem", "Henryk Sienkiewicz",
                            2000, 521, "WSSiP", "118-33-346-1478-32");
        books[1] = new Book("Java. Podstawy. Wydanie VIII", "Cay S. Horstmann, Gary Cornell",
                            2008, 888, "Helion", "978-83-246-1478-3");
        books[2] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                            1987,544, "PWN", "978-83-246-1478-3" );

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}
