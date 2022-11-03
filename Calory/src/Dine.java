import java.util.ArrayList;
public class Dine extends Manager<Food> implements Factory {

    public static void main(String[] args) {
        Dine a = new Dine();
        a.mymain();
    }
    void mymain() {
        readFoods(this);
        readEats();
    }

    void readEats() {
        int day, month;
        String eatType;
        Eat eat = null;
        ArrayList<Eat> eatlist = new ArrayList<>();
        int totalCal = 0;
        while (true) {
            month = scan.nextInt();
            if (month == 0)
                return;
            day = scan.nextInt();
            eatType = scan.next();
            int cc = scan.nextInt();
            for (int i = 0; i < cc; i++) {
                Eat et = new Eat();
                et.read(scan, (Dine) this);
                eatlist.add(et);
                totalCal += et.getKcal();
            }
            System.out.printf("%d/%d %s ",
                    month, day, eatType);
            System.out.printf("��Į�θ�: %dkcal\n", totalCal);;
            for (Eat f : eatlist)
                System.out.println("  "+f);
        }
    }

    @Override
    public Food create(String kwd, int a) {
        if (a == 1)
            return new Food(kwd);
        else
            return new DFood(kwd);
    }
}