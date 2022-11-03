import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    Scanner scan = new Scanner(System.in);
    ArrayList<Snack> snackList = new ArrayList<>();
    ArrayList<Customer> cuList = new ArrayList<>();;

    void run() {
        readAll();
        printAll();
        readAllOrders();
        serviceAllCustomers();
        printAllOrders();
        //printAll();
    }
    void serviceAllCustomers() {
        for (Customer c: cuList)
            c.service();
    }
    static String types[] = {"coffee", "noncoffee", "tea", "snack"};
    private void printAllOrders() {
        // TODO Auto-generated method stub
        System.out.println("========== 판매 현황 =============");
        for (Customer c: cuList)
            c.print();
        printAll();
        System.out.println("========== 종류별 판매 총계 =============");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-10s: %d개\n", types[i], Snack.sells[i]);
        }
    }

    void readAll() {
        Snack sn = null;
        String name = null;
        int index = 1;
        while(true)
        {
            name = scan.next();
            if(name.equals("0"))
                break;
            sn = new Snack(index, name);
            sn.read(scan);
            snackList.add(sn);
            index++;
        }
    }

    void readAllOrders() {
        String phnum = null;
        Customer c = null;
        while(true)
        {
            //System.out.print("주문입력: ");
            phnum = scan.next();
            if(phnum.equals("0"))
                break;
            c = new Customer(phnum);
            c.read(scan, this);
            cuList.add(c);
        }
    }

    void printAll() {
        for (Snack s : snackList) {
            s.print();
        }
    }
    public static void main(String[] args) {
        Store mgr = new Store();
        mgr.run();
    }

    public Snack findSnack(int n) {
        // TODO Auto-generated method stub
        if (n <= 0 || n > snackList.size())
            return null;
        return snackList.get(n-1);
    }
}
