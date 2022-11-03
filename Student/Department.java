import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Team> teamList = new ArrayList<>();
    //ArrayList<Subject> subList = new ArrayList<>();

    void run() {
        int menu;
        readAll();
        readAllTeams();
        while (true) {
            System.out.print("1) every print 2) input score ");
            System.out.println("3) search 4) multy search 5) search score");
            System.out.print("6) search teams 0) exit");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    printAll();
                    break;
                case 2:
                    inputScores();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    multiSearch();
                    break;
                case 5:
                    searchScore();
                    break;
                case  6:
                    searchTeam();
                    break;
                default:
                    break;
            }
        }
    }

    /*void printAllSubject() {
        for (Subject s : subList)
            s.print();
    }

    void readAllSubject() {
        System.out.println("<input subject>");
        String token = null;
        Subject s = null;
        while (true) {
            token = scan.next();
            if (token.equals("end"))
                break;
            s = new Subject(token);
            s.read(scan);
            subList.add(s);
        }
    }*/

    private void readAllTeams() {
        System.out.println("<give team>");
        String token = null;
        Team t = null;
        while (true) {
            token = scan.next();
            if (token.equals("end"))
                break;
            t = new Team(token);
            t.read(scan, this);
            teamList.add(t);
        }
    }

    private void printAllTeams() {
        for (Team t : teamList)
            t.print();
    }
    void inputScores() {
        for (Student st : studentList) {
            st.inputScore();
        }
    }

    void readAll() {
        Student st = new Student();
        int id;
        while (true) {
            id = scan.nextInt();
            if (id == 0)
                break;
            st = new Student();
            st.read(scan, id);
            studentList.add(st);
        }

    }

    void multiSearch() {
        String kwd;
        kwd = scan.nextLine();
        String[] kwdArr;
        while (true) {
            System.out.print("multy search: ");
            kwd = scan.nextLine();
            if (kwd.contentEquals("end"))
                break;
            kwdArr = kwd.split(" ");
            for (Student st : studentList)
                if (st.matches(kwdArr))
                    st.print();
        }
    }

    void searchScore() {
        String minScore;
        String maxScore;

        while (true) {
            System.out.print("search by score range: ");
            minScore = scan.next();
            if (minScore.equals("end"))
                break;
            if (minScore.charAt(0) == '-' /* || minScore.charAt(2)=='-' 이렇게 구현하면 되지 않을까 싶었지만 실패 */) {
                for (Student st : studentList) {
                    if (st.matchScore(minScore))
                        st.print();
                }
                continue; // 코드 추가한 이유 ex)-60 이렇게 입력할 경우 maxScore 받을 필요 없어서
            }
            maxScore = scan.next();
            for (Student st : studentList)
                if (st.matchScore(minScore, maxScore))
                    st.print();
        }
    }

    void search() {
        String kwd;
        //kwd = scan.nextLine();
        while (true) {
            System.out.print("search keyword: ");
            kwd = scan.next();
            if (kwd.equals("end"))
                break;
            for (Student st : studentList)
                if (st.matches(kwd))
                    st.print();
        }
    }

    void printAll() {
        for (Student st : studentList)
            st.print();
        printAllTeams();
    }

    void searchTeam() {
        String kwd;
        //kwd = scan.nextLine();
        while (true) {
            System.out.print("team search keyword: ");
            kwd = scan.next();
            if (kwd.equals("end"))
                break;
            for (Team t : teamList)
                if (t.matches(kwd))
                    t.print();
        }
    }

    Student findStudent(int studentNumber) {
        if (studentNumber <= 0 ||
        studentNumber > studentList.size())
            return null;
        return studentList.get(studentNumber - 1);
    }

    public static void main(String[] args) {
        Department department = new Department();
        department.run();
    }
}