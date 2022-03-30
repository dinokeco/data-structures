package ba.edu.ibu.sort.comparable;

public class Student implements Comparable<Student> {
	
	String fullName;
	double gpa;
	
	public Student(String fullName, double gpa) {
		super();
		this.fullName = fullName;
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student o) {
		if (this.gpa > o.gpa) {
			return 1;
		} else if (this.gpa < o.gpa) {
			return -1;
		} else {
			return 0;
		}
	}
}
