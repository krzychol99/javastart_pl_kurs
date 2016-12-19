/**
 * Created by MałaMi on 2016-12-18.
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book("Java. Podstawy. Wydanie VIII", "Cay S. Horstmann, Gary Cornell",
                            2008, 888, "Helion", "978-83-246-1478-3");
        Book book2 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                            1987,544, "PWN", "978-83-246-1478-3" );

        System.out.print(appName);
        System.out.println("Książki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
    }
}
