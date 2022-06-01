package classes;
import interfaces.StudentOperations;
import interfaces.EmployeeOperations;
import interfaces.DepartmentOperations;

public class University implements StudentOperations, EmployeeOperations, DepartmentOperations{
	private Student students[] = new Student[5000];
	private int studentCount = 0;
	private Employee employees[] = new Employee[500];
	private int employeeCount = 0;
	private Department departments[] = new Department[10];
	private int departmentCount = 0;
	
	public void insertStudent(Student student){
		if(students[studentCount] == null){
			students[studentCount++] = student;
		}
		else
			studentCount++;
		    
	}
	public void showAllStudents(){
		int i=0;
		while(students[i] !=null){
			students[i].showInfo();
			i++;
		}
	}
	public void insertEmployee(Employee employee){
		if(employees[employeeCount] == null){
			employees[employeeCount++] = employee;
		}
		else
			employeeCount++;
	}
	
	public void showAllEmployees(){
		int i=0;
		while(employees[i] !=null){
			employees[i].showInfo();
			i++;
		}
	}
	
	public void addDepartment(Department department){
		if(departments[departmentCount] == null){
			departments[departmentCount++] = department;
		}
		else
			employeeCount++;
	}
	
	public void showAllDepartments(){
		int i=0;
		while(departments[i] !=null){
			departments[i].showInfo();
			i++;
		}
	}
	
}