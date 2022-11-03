import java.util.*;

public class Product {
    String codeNumber;
    String name;
    int price;

    void read(Scanner scan) {
        codeNumber = scan.next();
        name = scan.next();
        price = scan.nextInt();
    }

    void print() {
        System.out.println("[" + codeNumber + "] " + name + "    " + price + "원");
    }
}