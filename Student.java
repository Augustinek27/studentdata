package studentData;

public class Student {
	public String name;
	public String address;
	public Double gpa;
	
	public Student(String name, String address, Double gpa) {
		this.name = name;
		this.address = address;
		this.gpa = gpa;
	}
	
	/* Getters */
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Double getGPA() {
		return gpa;
	}
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address + "\nGPA: " + this.gpa;
	}
}
