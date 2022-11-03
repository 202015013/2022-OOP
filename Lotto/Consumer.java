import java.util.ArrayList;
import java.util.Scanner;

public class Consumer {
    Lotto lotto = new Lotto();
    ArrayList<Integer> myNumber = null;
    Scanner scan = new Scanner(System.in);
    String name = null;
    String phoneNumber = null;

    void input(Scanner scan) {
        phoneNumber = scan.next();
    }

    void takeNumber() {
        myNumber = new ArrayList<>();
        myNumber = (ArrayList<Integer>) lotto.pickLottoNum().clone();
    }

    int checkNumber(ArrayList ownNumber, ArrayList winnerNum) {
        int collectedCount = 0;

        for (int i = 0; i < 6; i++) {
            if (ownNumber.contains(winnerNum.get(i))) {
                collectedCount += 1;
            }
        }
        return collectedCount;
    }
}
