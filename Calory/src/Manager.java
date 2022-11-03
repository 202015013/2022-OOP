import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Manager <T extends Manageable>{
    ArrayList<T> mList = new ArrayList<>();
    HashMap<String, T> foodMap = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    void readFoods(Factory<T> fac) {
        T m = null;
        String type;
        int k;
        while (true) {
            k = scan.nextInt();
            if (k == 0)
                break;
            type = scan.next();
            m = fac.create(type, k);
            m.read(scan);
            mList.add(m);
            foodMap.put(m.getName(), m);
        }
        for (T n : mList) {
            System.out.println(n);
        }
    }
    Manageable findFood(String n) {
        T m = foodMap.get(n);
        if (m == null) {
            System.out.println("find null => " + n);
            throw new NullPointerException();
        }
        return m;
    }
}
