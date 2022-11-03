import java.util.*;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    CommandManager CM = new CommandManager();

    void run() {
        Polynomial p = null;

        while (true) {
            System.out.print("$ ");
            String command = sc.next();

            if (CM.checkCommand(command) == true) {
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.run();
    }
}
