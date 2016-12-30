package pl.krzychol99.app;

import pl.krzychol99.data.Book;
import pl.krzychol99.pl.krzychol99.utils.DataReader;

/**
 * Created by MałaMi on 2016-12-18.
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.6";
        Book [] books = new Book[1000];

        DataReader dataReader = new DataReader();

        System.out.println(appName);
        System.out.println("Wprowadz nową książkę:");
        books[0] = dataReader.readAndCreateBook();
        books[1]= dataReader.readAndCreateBook();
        books[2]= dataReader.readAndCreateBook();

        dataReader.close();

        books[0].printInfo();
        books[1].printInfo();
        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}
