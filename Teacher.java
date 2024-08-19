package SchoolManagementProject;

public class Teacher {
	
	int id;
	String name;
	public Teacher(int id, String name) {
	
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Teacher [ID=" + id + ", NAME=" + name + "]";
	}
	

}
