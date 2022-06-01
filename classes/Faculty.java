package classes;

public class Faculty extends Employee{
	public Faculty(String name, String id, double salary){
		super(name, id, salary);
	}
	public void withdrawSalary(double amount){
		double salary = getSalary();
		if( salary >= amount){
			setSalary(salary - amount);	
		}
	}
}