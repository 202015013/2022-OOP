import java.util.Scanner;

public class Snack {
    // 에스프레소 coffee 3800 20
    int id;
    String name;
    int type;
    int price;
    int remain;
    int sold;
    static int sells[] = {0, 0, 0, 0};
    public Snack(int id, String name) {
        // TODO Auto-generated constructor stub
        this.id = id;
        this.name = name;
    }

    public void read(Scanner scan) {
        // TODO Auto-generated method stub
        type = scan.nextInt();
        price = scan.nextInt();
        remain = scan.nextInt();
    }

    public void print() {
        // TODO Auto-generated method stub
        System.out.printf("[%2d] %s (%s) %4d원 (%d개",
                id, name, Store.types[type-1], price, remain);
        if (sold == 0)
            System.out.println(")");
        else
            System.out.printf("/%d개)\n", sold);
    }

    public int sell() {
        // TODO Auto-generated method stub
        sells[type-1]++;
        sold++;
        remain--;
        return price;
    }

}
