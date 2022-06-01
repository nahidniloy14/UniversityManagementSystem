package classes;

public class Course{
	private String courseName;
	private Department department;
	public Course(){}
	public Course(String courseName){this.courseName = courseName;}
	public String getCourseName(){
		return courseName;
	}
	public void setDepartment(Department department){
		this.department = department;
	}
	public Department getDepartment(){
		return department;
	}
	public void showInfo(){
		System.out.println("Course Name: " + courseName);
	}
}