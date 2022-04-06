package ba.edu.ibu.sort.comparable;

import java.util.Comparator;

public class ByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.fullName.compareTo(o2.fullName);
	}

}
