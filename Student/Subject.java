/*import java.util.Scanner;

public class Subject {
    String code;
    String title;
    int year;
    String date;
    String time;

    Subject(String code) {
        this.code = code;
    }

    void read(Scanner scan) {
        title = scan.next();
        year = scan.nextInt();
        date = scan.next();
        time = scan.next();
    }

    void print() {
        System.out.format("[%s]  %s  %d year %s%s\n",
                code, title, year, date, time);
    }
}

Scanner openFile(String filename) {
Scanner filein = null;
try {
filein = new Scanner(new file(filename));
} catch (Exception e) {
System.out.printf("파일 오픈 실패: %s\n", filename);
System.exit(0);
}
return filein;
}


Scanner filein = openFile(filename);
Student st = null;
while (filein.hasNext()) {
st = new Student();
st.read(filein);
studentList.add(st);
}
filein.close();





public class Department
{
	// ...

	void searchStudentBySubject()
	{
		String kwd;
		System.out.print("�˻��� ���� : ");
		kwd = scan.next();
		Subject sub = findSubject(kwd);
		if (sub == null) {
			System.out.println("���� ������Դϴ�");
			return;
		}
		sub.print();
		System.out.println();
		for (Student st : studentList)	{
			if(st.containsSubject(sub)) {
				System.out.print("\t");
				st.print();
			}
		}
		System.out.println();
	}
	void searchDay()
	{
		String kwd;
		System.out.print("�˻��� ���� : ");
		kwd = scan.next();
		Subject sub = null;
		System.out.format("%s���� ������ �����ϴ� �л� :", kwd);
		for (Student st : studentList) {
			if(st.matchesDay(kwd))
				System.out.print(st.name + " ");
		}
		System.out.println();
	}

	int countDiffYear()
	{
		int count = 0;
		Student st = null;
		for (Student st : studentList) {
			if (!st.matchesYear())
				count++;
		}
		return count;
	}



	public class Student
{
	// ...
	boolean matchesDay(String kwd)
	{
		for(Subject sub : registeredList)
		{
			if(sub.matches(kwd))
				return true;
		}
		return false;
	}

	boolean containsSubject(Subject sub)
	{
		return registeredList.contains(sub);
	}
	boolean matchYear()
	{
		for (Student st : studentList)
		{
			if(sub.year != st.year)
				return false;
		}
		return true;
	}
}
}*/