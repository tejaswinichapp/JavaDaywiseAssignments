package Day.wise.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement {

	public static void main(String[] args) {
		// Creating 5 student objects
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Alice", "1234567890", "Math", 1000.0));
		students.add(new Student(2, "Bob", "2345678901", "Science", 1500.0));
		students.add(new Student(3, "Charlie", "3456789012", "Math", 1100.0));
		students.add(new Student(4, "David", "4567890123", "History", 1300.0));
		students.add(new Student(5, "Eve", "5678901234", "Science", 1400.0));

		// Display the student details coursewise
		System.out.println("Displaying students coursewise:");
		displayStudentsCoursewise(students);

		// Display the total fees of all the students
		double totalFees = calculateTotalFees(students);
		System.out.println("Total fees of all students: " + totalFees);
	}

	// Method to display students coursewise using a Map
	public static void displayStudentsCoursewise(List<Student> students) {
		// Using a Map to group students by course
		Map<String, List<Student>> courseMap = new HashMap<>();

		for (Student student : students) {
			String course = student.getCourse();
			if (!courseMap.containsKey(course)) {
				courseMap.put(course, new ArrayList<>());
			}
			courseMap.get(course).add(student);
		}

		// Display students grouped by course
		for (Map.Entry<String, List<Student>> entry : courseMap.entrySet()) {
			System.out.println("Course: " + entry.getKey());
			for (Student student : entry.getValue()) {
				student.display();
			}
		}
	}

	// Method to calculate the total fees of all students
	public static double calculateTotalFees(List<Student> students) {
		double totalFees = 0;
		for (Student student : students) {
			totalFees += student.getFees();
		}
		return totalFees;
	}
}
