import java.util.*;

public class BookStore {
    Scanner scan = new Scanner(System.in);
    ArrayList<Book> bookList = new ArrayList<>();

    void run() {
        readAllBooks();
        printAllBooks();
        search();
    }

    private void printAllBooks() {
        for (Book b : bookList)
            b.print();
    }

    void readAllBooks() {
        String tmp = null;
        Book b = null;
        int n = 0;
        while (true) {
            n = scan.nextInt();
            if (n == 0)
                break;
            tmp = scan.next();
            switch (n) {
                case 1:
                    b = new Book();
                    break;
                case 2:
                    b = new EBook();
                    break;
                case 3:
                    b = new AppendixBook();
                    break;
                default:
                    break;
            }
            if (tmp.contentEquals("end"))
                break;
            b.read(scan);
            bookList.add(b);
        }
    }

    void search() {
        String kwd = null;
        while (true) {
            System.out.print(">> ");
            kwd = scan.next();
            for (Book b : bookList)
                if (b.matches(kwd))
                    b.print();
        }
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.run();
    }
}
