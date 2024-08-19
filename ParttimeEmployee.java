package salarymangment;

public class PartTimeEmployee extends Employee {

	private int hourWorked;
	private double hourRate;
	
	
	public PartTimeEmployee (String name,int id,double salary,int hourworked,double hourrate) {
		super(name,id,salary);
	
	    this.hourWorked = hourworked;
		this.hourRate = hourrate;
		
		
		
		
	}
	
	@Override
	public double CalculateSalary() {
	return this.hourRate * this.hourWorked ;
		}
	

}

