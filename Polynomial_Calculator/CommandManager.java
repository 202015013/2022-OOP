import java.util.*;

public class CommandManager {
    ArrayList<Polynomial> polynomials = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    boolean checkCommand(String command) {
        if (command.equals("exit"))    // 종료
            return false;

        if (command.equals("create")) {
            Polynomial p = new Polynomial();
            p.read(sc);
            polynomials.add(p);
            return true;
        }
        Polynomial p = find(sc);
        //p = find(sc);  // 그 이외의 경우는 이름을 입력받음

        switch (command) {
            case "add": // 다항식에 새로운 항 (c x ^ e)를 더함
                p.add(sc);
                break;
            case "calc": // 입력한 수로 f(x)를 계산
                Polynomial poly = find(sc);
                int n = sc.nextInt();
                int result = p.calc(poly, n);
                System.out.println(result);
                break;
            case "print": // 다항식 출력.
                p.print();
            default:
                sc.nextLine();
                break;
        }
        return true;
    }

    Polynomial find(Scanner sc) {
        if (polynomials.contains(sc)) {
            return polynomials.get(polynomials.indexOf(sc));
        }
        return null;
    }
}
