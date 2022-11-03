import java.util.*;

public class Polynomial extends CommandManager {
    ArrayList<Term> termArray = new ArrayList<>();
    char name; // 다항식의 이름
    int c = 0;
    int e = 0;

    // 입력에서 다항식의 이름과 계수, 지수를 받아 이름 저장 및 항을 하나 생성
    // 입력: f 3 4
    void read(Scanner scan) {
        name = scan.next().charAt(0);
        c = scan.nextInt();
        e = scan.nextInt();
        Term term = new Term(c, e);
        termArray.add(term);
    }

    // 이 다항식을 f = 3 x ^ 4 + 2 x + 6 형태로 출력
    void print() {
        System.out.println(name + " = ");
        for (int i = 0; i < termArray.size(); i++) {
            if (i == termArray.size() - 1)
                System.out.println(" 0 ");
            else
                termArray.get(i).print();
        }
    }

    // x의 값을 받아 다항식을 계산한 결과를 반환
    int calc(Polynomial p, int x) {
        int result = 0;
        for (int i = 0; i < p.termArray.size(); i++) {
            result += p.termArray.get(i).calc(x);
        }
        return result;
    }

    // 항을 하나 입력받아 이 다항식에 내림차순으로 더한다. 항은 계수와 지수를 입력함
    void add(Scanner sc) {
        Polynomial p = find(sc);
        int c = sc.nextInt();
        int e = sc.nextInt();

        if (findTerm(p, e) == null) {
            addTerm(c, e);
        } else {
            findTerm(p, e).add(c);
        }
    }

    // 항을 추가하거나 항을 찾는 함수 private
    private void addTerm(int c, int e) {
        Term term = new Term(c, e);
        termArray.add(term);
    }

    private Term findTerm(Polynomial p, int e) {
        Term findedterm = null;
        for (int i = 0; i < p.termArray.size(); i++) {
            Term term = p.termArray.get(i);
            switch (term.compare(e)) {
                case 1:
                case -1:
                    break;
                case 0:
                    findedterm = term;
                    break;
            }
        }
        return findedterm;
    }
}

