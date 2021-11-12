package com.homeworkclass15;

public class Students {

	/*
	 * Create a Class called Students Create three variables studentName , studentID
	 * and numberOfStudents Create three objects of the Students Class Set the value
	 * for studentName , studentID and increment the numberOfStudents for each
	 * object Print out total number of students
	 * 
	 */
	String studentName;
	int studentID;
	static int numberOfStudents = 20;

	public static void main(String[] args) {

		Students a = new Students();

		a.studentName = "Bilal";
		a.studentID = 12345;

		numberOfStudents++;

		System.out.println(Students.numberOfStudents);
		
		Students a1=new Students();
		
		a1.studentName="Sarah";
		a1.studentID=234567;
		numberOfStudents++;
		System.out.println(Students.numberOfStudents);
		
		Students a2=new Students();
		
		a2.studentName="Aisha";
		a2.studentID=877474;
		numberOfStudents++;
		System.out.println(Students.numberOfStudents);

	}

}
