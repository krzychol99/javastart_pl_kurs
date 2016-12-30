package pl.krzychol99.pl.krzychol99.utils;

import pl.krzychol99.data.Book;

import java.util.Scanner;
/**
 * Created by krzychol99 on 2016-12-30.
 */
public class DataReader {
    private Scanner sc;

    public DataReader(){
        sc = new Scanner(System.in);
    }
    public void close(){
        sc.close();
    }
    public Book readAndCreateBook(){
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilość stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author,releaseDate,pages,publisher,isbn);
    }

}
