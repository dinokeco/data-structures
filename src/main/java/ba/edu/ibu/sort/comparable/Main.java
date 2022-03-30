package ba.edu.ibu.sort.comparable;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student[] students = {
			new Student("Name 1", 7.34),
			new Student("Name 2", 5.32),	
			new Student("Name 3", 8.54),	
			new Student("Name 4", 10),	
			new Student("Name 5", 6.74),	
			new Student("Name 6", 9.76),	
		};
		
		Arrays.sort(students);
		
		for (Student s: students) {
			System.out.println(s.fullName + " - " + s.gpa);
		}
	}

}
