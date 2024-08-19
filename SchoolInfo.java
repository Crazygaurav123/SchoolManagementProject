package SchoolManagementProject;

import java.util.ArrayList;



public class SchoolInfo {
	
	ArrayList<Student> StuList = new ArrayList<>();
	public static int count = 0;
	
	public SchoolInfo() {
		
	}
	
	public int countStudent() {
		
		return StuList.size();
		
	}
	public void addStudent(Student student) {
		StuList.add(student);
	}
	
	// A method to get(update) a student at a specific index, returns null if out of bound
	
	public Student getStudent(int index) {

		return StuList.get(index);
	}
	
	/*
	 * A method to find a Student with a given ID and return its index, or
	 * -1 if not found
	 */

	public int findStudent(int id) {
		for (int i = 0; i < StuList.size(); i++) {
			if (StuList.size() > 0) {

				if (StuList.get(i).getId() == id) {
					return i;
				}
			}
		}
		return -1;
	}
	

	/*
	 * A method to remove a student Info from the SchoolInfo class , returns true if removed
	 * successfully, false otherwise
	 */

	public boolean removeStudent(Student student)  {
		int index = 0;
			index = findStudent(student.getId());
		if (index == -1) {
			return false;
		}
		
			StuList.remove(index);
		
		return true;
	}
	// A method to display the  Student information of the Student class 

	public void showStudentInfo() {
		System.out.println("*** School Management System ***");
		System.out.println("1: Add a Student Information:");
		System.out.println("2: find a Student information:");
		System.out.println("3: Remove the Student Info in School:");

	}

}
