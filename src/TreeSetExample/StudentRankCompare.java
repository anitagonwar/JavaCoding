package TreeSetExample;

// Java Program to Avoid Duplicate User
// Defined Objects in TreeSet
import java.util.*;

public class StudentRankCompare {

	public static void main(String args[]) {

		// create a TreeSet which stores objects of type
		// Student
		TreeSet<Student> students = new TreeSet<>();

		// add objects to the TreeSet
		students.add(new Student("Raghav", 12));
		students.add(new Student("Tilak", 11));

		// adding an object with same rank
		students.add(new Student("Ayush", 12));

		// adding an object with same name but different
		// rank
		students.add(new Student("Raghav", 32));

		// print the TreeSet
		for (Student s : students) {
			System.out.println(s);
		}
	}

}
