import java.util.Scanner;

class Eat {
    Manageable food;
    int qnty;
    String unit;
    int kcal;
    void read(Scanner scan, Dine main) {
        String name = scan.next();
        qnty = scan.nextInt();
        unit = scan.next();
        food = main.findFood(name);
        kcal = getKcal();
    }
    @Override
    public String toString() {
        return String.format("%s %d%s(%dkcal) - %s",
                food.getName(), qnty, unit, kcal, food.getDetail(qnty, unit));
    }
    public int getKcal() {
        return food.getKcal(qnty,  unit);
    }
}