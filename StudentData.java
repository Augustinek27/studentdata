package studentData;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class StudentData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Student> students = new LinkedList<Student>();
		int remainInLoop = 1;
		
		while (remainInLoop == 1) {
			students.add(createStudent(scanner));
			System.out.println("Would you like to create another student(1 for yes/0 for no)? ");
			remainInLoop = scanner.nextInt();
			scanner.nextLine();
		}
		Collections.sort(students, Comparator.comparing(Student::getName));
		writeToFile(students);
		System.out.println("The contents of this have been written to StudentData.txt! Thank you!");
	}
	
	private static Student createStudent(Scanner scanner) {
		System.out.println("What is the name of the student? ");
		String name = scanner.nextLine();
		System.out.println("What is the address of the student? ");
		String address = scanner.nextLine();
		System.out.println("What is the GPA of the student? ");
		Double gpa = scanner.nextDouble();
		scanner.nextLine();
		Student newStudent = new Student(name, address, gpa);
		return newStudent;
	}
	
	private static void writeToFile(LinkedList<Student> students) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("StudentData.txt", true))) {
        	for (Student student : students) {
        		writer.println(student);
        		writer.println("");
        	}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
