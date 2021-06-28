//2. Java program to find top 3 ranks among 5 students (student name,marks,id)

package StudentPrograms;

import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class StudentsRank {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			System.out.println("Enter StudentId StudentName StudentMarks");
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s2.getCgpa() > s1.getCgpa()) {
					return 1;
				} else if (s2.getCgpa() < s1.getCgpa()) {
					return -1;
				}
				return s1.getFname().compareTo(s2.getFname());
			}
		});
		System.out.println("Students Ranklist from highest to lowest : ");
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
		
		System.out.println("List of Top 3 students : ");
		for (int i=0;i<3;i++) {
			System.out.println(studentList.get(i).getFname());
		}
	}

}
