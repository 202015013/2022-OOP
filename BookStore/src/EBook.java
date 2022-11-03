import java.util.Scanner;

class EBook extends Book {
    String url;
    String format;

    @Override
    void read(Scanner scan) {
        super.read(scan);
        url = scan.next();
        format = scan.next();
    }

    @Override
    void printBookType() {
        System.out.print("[E Book");
    }

    @Override
    void print() {
        super.print();
        System.out.format("\t%s [%s]", url, format);
        System.out.println();
    }

    @Override
    boolean matches(String kwd) {
        if (super.matches(kwd) ||
                url.contains(kwd) ||
                format.equals(kwd) ||
                kwd.equals("E book"))
            return true;
        return false;
    }
}
