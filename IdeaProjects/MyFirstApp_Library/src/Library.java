/**
 * Created by MałaMi on 2016-12-18.
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.1";

        Book book1 = new Book();
        book1.title = "Java. Podstawy. Wydanie VIII";
        book1.author = "Cay S. Horstmann, Gary Cornell";
        book1.releaseDate = 2008;
        book1.pages = 888;
        book1.publisher = "Helion";
        book1.isbn = "978-83-246-1478-3";

        System.out.print(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);
    }
}
