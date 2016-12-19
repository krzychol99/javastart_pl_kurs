/**
 * Created by MałaMi on 2016-12-18.
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.1";

        String title = "Java. Podstawy. Wydanie VIII";
        String author = "Cay S. Horstmann, Gary Cornell";
        int releaseDate = 2008;
        int pages = 888;
        String publisher = "Helion";
        String isbn = "978-83-246-1478-3";

        System.out.print(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(title);
        System.out.println(author);
        System.out.println(releaseDate);
        System.out.println(pages);
        System.out.println(publisher);
        System.out.println(isbn);
    }
}
