package classes;

public abstract class Employee{
	private String name;
	private String id;
	private double salary;
	
	public Employee(){};
	public Employee(String name, String id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void setName(String name){this.name = name;}
	public void setId(String id){this.id = id;}
	public void setSalary(double salary){this.salary = salary;}
	
	public String getName(){return name;}
	public String getId(){return id;}
	public double getSalary(){return salary;}
	
	public abstract void withdrawSalary(double salary);
	
	public void showInfo(){
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary: " + salary);
		
	}
}