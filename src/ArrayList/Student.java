package ArrayList;

public class Student {

	String studentname;
	int studentregno;
	
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getStudentregno() {
		return studentregno;
	}

	public void setStudentregno(int studentregno) {
		this.studentregno = studentregno;
	}
	
	public Student(String studname, int studregno) {
		this.studentname = studname;
		this.studentregno = studregno;
	}
}
