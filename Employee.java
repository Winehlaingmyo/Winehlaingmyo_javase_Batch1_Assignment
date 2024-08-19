package salarymangment;

public class Employee {
      
	private String name;
	private int EmployeeID;
	private double Salary;
	
	public Employee(String name,int Empid,double salary) {
		this.name = name;
		this.EmployeeID = Empid;
		this.Salary = salary;
	}
	
	
	public  double getSalary() {
		return Salary; 
	}
	
	
	
	
	
	public double  CalculateSalary() {
		 
		return Salary;  
	
		}
	
	public void display() {
		System.out.println("Employee : " + this.name);
		System.out.println("Employee ID : " + this.EmployeeID);
		System.out.println("Basic Salary : " +this.Salary);
		System.out.println("Total Salary : " + CalculateSalary()); 
		System.out.println();
	}
	
	
	
	}
	
	
	
	
	

