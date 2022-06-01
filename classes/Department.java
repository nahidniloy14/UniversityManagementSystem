package classes;

public class Department{
	private String deptName;
	private Student[] students;
	private int studentCount;
	private Course[] courses;
	private int courseCount;
	public Department(){
		students = new Student[1000];
		studentCount = 0;
        courses = new Course[100];
		courseCount = 0;
	}
	public Department(String deptName){
		this.deptName = deptName;
		students = new Student[1000];
		studentCount = 0;
		courses = new Course[100];
		courseCount = 0;
	}
	public void addStudent(Student student){
		students[studentCount++] = student;
		student.setDepartment(this);
	}
	public void showAllStudents(){
		for(int i=0; i<studentCount; i++){
			students[i].showInfo();
		}
	}
	public void addCourse(Course course){
		courses[courseCount++] = course;
		course.setDepartment(this);
	}
	public void showAllCourses(){
		for(int i=0; i<courseCount; i++){
			courses[i].showInfo();
		}
	}
	public void showInfo(){
		System.out.println("Department Name: " + deptName);
	}
}