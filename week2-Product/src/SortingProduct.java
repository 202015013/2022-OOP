import java.util.*;

public class SortingProduct {
    Scanner scan = new Scanner(System.in);
    ArrayList<Product> productList = new ArrayList<>();

    void run() {
        readAll();
        printAll();
    }

    Product makeProduct(Product item, Scanner scan) {
        item = new Product();
        item.read(scan);
        return item;
    }

    void readAll() {
        Product item = null;
        for (int i = 0; i < 33; i++) {
            item = makeProduct(item, scan);
            productList.add(item);
        }
    }

    void printAll() {
        for (Product item : productList) {
            System.out.print(productList.indexOf(item) + ") ");
            item.print();
        }
    }

    public static void main(String args[]) {
        SortingProduct sorting = new SortingProduct();
        sorting.run();
    }
}
