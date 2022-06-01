package classes;

public class Student{ 
	private String studentName;
	private String studentId;
	private double cgpa = 0.0;
	private Department dept;
	private Semester[] semesters;
	private int semesterCount;
	public Student(){
		semesters = new Semester[15];
		semesterCount = 0;
		}
	public Student(String studentName, String studentId, double cgpa){
		this.studentName = studentName;
		this.studentId = studentId;
		this.cgpa = cgpa;
		semesters = new Semester[15];
		semesterCount = 0;
		}
	public void registerNewSemester(Semester semester){
		semesters[semesterCount++] = semester;
		System.out.print("Thank you for registering for " + semester.getSemesterName() + "\n");
	}
	public void addCourse(Course course){
		semesters[semesterCount-1].addCourse(course);
	}
	public void setDepartment(Department dept){
		this.dept = dept;
	}
	public Department getDepartment(){
		return dept;
	}
	public void showAllSemesters(){
		for(int i=0; i<semesterCount; i++){
			semesters[i].showAllCourses();
		}
	}
	public void showInfo(){
		System.out.println("Student Name: " + studentName);
		System.out.println("Student ID: " + studentId);
		System.out.println("Student CGPA: " + cgpa);
	}
}