package SchoolManagementProject;

import java.util.Scanner;

import com.StudentIdNotFoundException.StudentIdNotFoundException;

public class SchoolManagementSystem {

	public static void main(String args[]) throws StudentIdNotFoundException {

		// Create a new SchoolInfo object
		SchoolInfo school = new SchoolInfo();

		do {
			// Display the StudentInfo

			school.showStudentInfo();

			// get the user StudentInfo choice

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();

			// Add a Student to the SchoolInfo
			if (choice == 1) {

				// Create a new Student object
				Student student = new Student();

				// Display the showStudent and get the students details from the user
				student.showStudent();

				// Add the student to the SchoolInfo
				school.addStudent(student);

			} // find a Student Information in the SchoolInfo class
			else if (choice == 2) {
				// Using the Student id to find the Student Information
				System.out.println("Enter the Student ID that you want to find Student Info:");
				int userChoice = sc.nextInt();

				// Searching for the Student in the SchoolInfo and get user index
				int indexUser = school.findStudent(userChoice);

				// printing the Student information of the Student with the given student ID
				System.out.println("The student Information  with the given Student ID : "
						+ school.getStudent(school.findStudent(userChoice)));

			} // Deleting the Student Information in the schoolInfo class

			else if (choice == 3) {

				// Ask the user for the Student ID of the student they want to delete
				System.out.println("Enter the student ID  that you want to Delete Student Info:");
				int userChoice = sc.nextInt();

				// Get the Student object form the SchoolInfo using its Student ID
				try {
					Student student = school.getStudent(school.findStudent(userChoice));
					// Remove the student from the School
					System.out.println("Your Given information is delete:" + school.removeStudent(student));
				} catch (Exception e) {

					// System.err.println("This student ID is not found");
					System.out.println(e.getMessage());
					throw new StudentIdNotFoundException("Sorry this  Id Number is not found \n Enter correct Id ");

				}

			}

		} while (true);

	}

}
