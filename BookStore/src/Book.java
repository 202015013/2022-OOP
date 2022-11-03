import java.util.*;

public class Book {
    ArrayList<String> authors = new ArrayList<>();

    String title;
    String pub;
    String isbn;
    int year;
    int price;

    void read(Scanner scan) {
        title = scan.next();
        pub = scan.next();
        isbn = scan.next();
        year = scan.nextInt();
        String token = null;
        while (true) {
            token = scan.next();
            if (token.contentEquals("0"))
                break;
            authors.add(token);
        }
        price = scan.nextInt();
    }

    void printBookType() {
        System.out.print("[normal Book");
    }
    void print() {
        printBookType();
        System.out.format("%s (%s / %s / %d year)  [%d원] author:"
                , title, pub, isbn, year, price);
        for (String a : authors)
            System.out.print(a + " ");
        System.out.println();
    }

    boolean matches(String kwd) {
        if (title.contains(kwd) ||
                isbn.equals(kwd))
            return true;
        return false;
    }
}
