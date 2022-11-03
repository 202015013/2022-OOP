import java.util.ArrayList;

public class MainSystem extends Lotto {
    ArrayList<Integer> winnerNumbers = null;
    void run() {
        getConsumerInfo();
        System.out.print("This week's number = [ ");

        makeWinnerNumber(pickLottoNum());
        printNumber(winnerNumbers);

        System.out.println("]");

        print();
    }

    void printNumber(ArrayList numbers) {
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    void print() {
        for (Consumer consumer : consumers) {
            System.out.print(consumer.phoneNumber + "  [ ");

            for (int i = 0; i < 6; i++)
                System.out.print(consumer.myNumber.get(i) + " ");

            int collectedNum = consumer.checkNumber(consumer.myNumber, winnerNumbers);
            System.out.println("] ==> (you got "
                    + collectedNum + ")   " + rank(collectedNum) + "ranking");
        }
    }

    int rank(int collectedNum) {
        int ranking = 0;
        switch (collectedNum) {
            case 3:
                ranking = 4;
                break;
            case 4:
                ranking = 3;
                break;
            case 5:
                ranking = 2;
                break;
            case 6:
                ranking = 1;
                break;
            default:
                break;
        }
        return ranking;
    }

    void makeWinnerNumber(ArrayList numbers) {
        winnerNumbers = new ArrayList<>();
        winnerNumbers = (ArrayList<Integer>) numbers.clone();

    }

    public static void main(String[] args) {
        MainSystem main = new MainSystem();
        main.run();
    }
}
