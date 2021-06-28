package TreeSetExample;

//implementing comparable interface
public class Student implements Comparable<Student> {

	private String name;
	private int rank;

	// constructor
	Student(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}

	// returns the student name
	private String getName() {
		return name;
	}

	// returns student rank
	public int getRank() {
		return rank;
	}

	/*
	 * overriding compareTo() method. if the object has same rank then it is
	 * considered as a duplicate entry, else, the entry is sorted on the basis of
	 * the student name.
	 */
	@Override
	public int compareTo(Student o) {
		if (rank == o.getRank()) {
			return 0;
		} else if (name.compareTo(o.getName()) < 0) {
			return -1;
		} else
			return 1;
	}

	// overriding toString() to print the student detail
	@Override
	public String toString() {
		return name + " (" + rank + ")";
	}
}
