import java.util.Random;
import java.util.Scanner;

class Student {
    String name;
    int id;
    String phone;
    Team myTeam;
    int year;
    int score;
    void read(Scanner scan, int id) {
        this.id = id;
        name = scan.next();
        phone = scan.next();
        year = scan.nextInt();
    }

    void print() {
        System.out.format("%d %s %s (%dyear) %s", id, name, phone, year, myTeam.teamName);
        if (score > 0)
            System.out.printf(" [%d]", score);
        System.out.println();
    }

    boolean matches(String kwd) {
        if (name.contains(kwd) ||
                kwd.length() > 3 && (id + "").contains(kwd) ||
                kwd.length() > 3 && phone.contains(kwd) ||
                (year + "").contentEquals(kwd))
            return true;
        return false;
    }

    public boolean matches(String[] kwdArr) {
        for (String kwd : kwdArr) {
            if (kwd.charAt(0) == '-' && matches(kwd.substring(1)))
                return false;
            if (kwd.charAt(0) != '-' && !matches(kwd))
                return false;
        }
        return true;
    }

    static Random rand = new Random();

    public void inputScore() {
        score = rand.nextInt(100) + 1;
        System.out.printf("name: %s (score: %d)\n", name, score);
    }

    boolean matchScore(String minScore, String maxScore) {
        if (score > Integer.parseInt(minScore) && score < Integer.parseInt(maxScore))
            return true;
        return false;
    }

    boolean matchScore(String minScore) {
        if (minScore.charAt(0) == '-' && score < (-1) * Integer.parseInt(minScore)) {
            return true;
        } else if (minScore.charAt(2) == '-' && score > Integer.parseInt(minScore.substring(0, 2))) {
            return true;
        }
        return false;
    }

    void setTeam(Team t) {
        myTeam = t;
    }

}