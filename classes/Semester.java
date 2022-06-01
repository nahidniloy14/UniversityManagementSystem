package classes;

public class Semester{
	private String semesterName;
	private Course[] courses;
	private int courseCount;
	public Semester(){
		courses = new Course[5];
		courseCount = 0;
	}
	public Semester(String semesterName){
		this.semesterName = semesterName;
		courses = new Course[5];
		courseCount = 0;
		 
	}
	public String getSemesterName(){
		return semesterName;
	}
	public void addCourse(Course course){
		if(courseCount<5){
		    courses[courseCount++] = course;
			System.out.println(course.getCourseName() + " Added");
		}
		else
			System.out.println("\nCan not take more than 5 courses in a semester. Register new semester");
	}
	public void showAllCourses(){
		for(int i=0; i<courseCount; i++){
			courses[i].showInfo();
		}
	}
	public void showInfo(){
		System.out.println("Semester Name: " + semesterName);
		
	} 
}