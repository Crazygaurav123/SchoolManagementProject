package SchoolManagementProject;

public class Course {
	
	int id;
	String name;
	public Course(int id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Course [ID=" + id + ", NAME=" + name + "]";
	}
	

}
