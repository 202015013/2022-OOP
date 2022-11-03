import java.util.Scanner;

public class Term extends CommandManager {
    public int coef;
    public int exponent;

    Term(int c, int e) {// 생성자
        coef = c;
        exponent = e;
    }

    // 항을 c x ^ e 형태로 출력
    void print() {
        System.out.println(coef + "x ^ " + exponent + " + ");
    }

    // x의 값을 받아 항을 계산한 결과를 반환
    int calc(int x) {
        int resultOfX = 0;
        for (int j = 0; j < exponent; j++) {
            resultOfX *= x;
        }
        return coef * resultOfX;
    }

    // 지수를 비교하여 exponent가 더 크면 1, 같으면 0, 작으면 -1 반환
    int compare(int e) {
        if (e < exponent)
            return 1;
        else if (e == exponent)
            return 0;
        else
            return -1;
    }

    // 지수가 같은 항의 계수를 받아 coef에 더한다
    void add(int c) {
        coef = +c;
    }
}
