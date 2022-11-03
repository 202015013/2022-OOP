import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    String phone;
    ArrayList<Snack> ordered = new ArrayList<>();
    int total = 0;
    Customer(String num) {
        phone = num;
    }
    void read(Scanner scan, Store store) {
        int n = 0;
        while (true) {
            n = scan.nextInt();
            if (n == 0)
                break;
            ordered.add(store.findSnack(n));
        }
    }
    void service() {
        for (Snack s: ordered) {
            total += s.sell();
        }
    }
    void print() {
        System.out.format("[%s] 총 %d원 (%d개)\t", phone, total, ordered.size());
        for (Snack s: ordered) {
            System.out.print(s.name + " ");
        }
        System.out.println();
    }
}
