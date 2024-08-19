  package SchoolManagementProject;

import java.util.Scanner;

public class Student  {
	
	
	int id;
	String name;
	String lastName;
	long mobileNo;
	String email;
	String dob;
	int age;
	String grade;
	
	
	Student(){
		
		}
	
	public Student(int id, String name, String lastName, long mobileNo, String email, String dob, int age,
			String grade) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.dob = dob;
		this.age = age;
		this.grade = grade;
	}



	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getLastName() {
		return lastName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getDob() {
		return dob;
	}

	
	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}


	
	
	// Creating an object of Scanner class to take input from user 
	Scanner sc  = new Scanner(System.in);
	
	// StudentShow method to display the student list
	
	public void showStudent() {
		
		System.out.println("Enter the Student ID:");
       this.id =  sc.nextInt();
       System.out.println("Enter the Student Name:");
       this.name = sc.next();
       System.out.println("Enter the Student LastName:");
       this.lastName = sc.next();
       System.out.println("Enter the Student Mobile.NO:");
       this.mobileNo = sc.nextLong();
       System.out.println("Enter the Student Email:");
       this.email = sc.next();
       System.out.println("Enter the Student DOB: ");
       this.dob = sc.next();
       System.out.println("Enter the Student Age:");
       this.age = sc.nextInt();
       System.out.println("Enter the Student Grade:");
       this.grade = sc.next();
       
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", email="
				+ email + ", dob=" + dob + ", age=" + age + ", grade=" + grade + "]";
	}
}
