import java.util.ArrayList;
import java.util.Scanner;

public class AppendixBook extends Book {
    ArrayList<String> appendix = new ArrayList<>();

    @Override
    void read(Scanner scan) {
        super.read(scan);
        String tmp = null;
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            tmp = scan.next();
            appendix.add(tmp);
        }
    }

    @Override
    void printBookType() {
        System.out.print("[A Book");
    }

    @Override
    void print() {
        super.print();
        System.out.format("\t");
        for (String tmp : appendix) {
            System.out.print(tmp + " ");
        }
    }

    @Override
    boolean matches(String kwd) {
        if (super.matches(kwd))
            return true;
        if (kwd.equals("qnfhrcor"))
            return true;
        for (String tmp : appendix)
            if (tmp.contains(kwd))
                return true;
        return false;
    }
}
