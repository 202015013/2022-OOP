import java.util.ArrayList;
import java.util.*;

public class Team {
    String teamName;
    ArrayList<Student> members = new ArrayList<>();;
    Team(String nmae) {
        teamName = nmae;
    }
    void read(Scanner scan, Department department) {
        int studentNumber = 0;
        Student st = null;
        while (true) {
            studentNumber = scan.nextInt();
            if (studentNumber == 0)
                break;
            st = department.findStudent(studentNumber);
            st.setTeam(this);
            members.add(st);
        }
    }

    void print() {
        System.out.printf("Team %s: ", teamName);
        for (Student st : members)
            System.out.printf("%s ,",st.name);
        System.out.println();
    }

    boolean matches(String kwd) {
        if (teamName.equals(kwd))
            return true;
        for (Student st : members)
            if (st.matches(kwd))
                return true;
        return false;
    }
}
