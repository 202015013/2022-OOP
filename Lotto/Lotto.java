import java.util.*;

public class Lotto {
    ArrayList<Consumer> consumers = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    int lottoNumber = 0;

    ArrayList pickLottoNum() {
        Random random = new Random();
        ArrayList<Integer> lottoNumbers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            lottoNumber = random.nextInt(1, 46);
            lottoNumbers.add(lottoNumber);
        }
        return lottoNumbers;
    }

    void getConsumerInfo() {
        Consumer consumer = null;
        while (true) {
            consumer = new Consumer();
            consumer.name = scan.next();
            if (consumer.name.equals("0"))
                break;
            consumer.input(scan);
            consumer.takeNumber();

            consumers.add(consumer);
        }
    }
}
