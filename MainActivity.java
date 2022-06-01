import interfaces.*;
import classes.*;

public class MainActivity{
	public static void main(String[] args){
		University u = new University();
		Student s1 = new Student("Jubair", "15-29999-2", 3.46);
		Student s2 = new Student("Mahadi", "15-30000-2", 3.00);
		
		
		u.insertStudent(s1);
		u.insertStudent(s2);
		u.showAllStudents();
		
		Employee e1 = new Faculty("Tanvir Ahmed", "12121", 50000);
		Employee e2 = new Faculty("Deep Nandi", "10101", 100000);
		
		Department cs = new Department("CS");
		Department eee = new Department("EEE");
		cs.addStudent(s1);
		
		Course c1 = new Course("PL1");
		cs.addCourse(c1);
		Course c2 = new Course("MAth1");
		cs.addCourse(c2);
		Course c3 = new Course("English1");
		cs.addCourse(c3);
		Course c4 = new Course("Computer Fundamentals");
		cs.addCourse(c4);
		Course c5 = new Course("Accounting");
		cs.addCourse(c5);
		Course c6 = new Course("Economics");
		cs.addCourse(c6);
		
		Semester s = new Semester("Fall 19-20");
		s1.registerNewSemester(s);
		
		s1.addCourse(c1);
		s1.addCourse(c2);
		s1.addCourse(c3);
		s1.addCourse(c4);
		s1.addCourse(c5);
		s1.addCourse(c6);
		
		cs.showAllStudents();
		s1.showInfo();
		
		
		
	}
}