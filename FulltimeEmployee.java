package salarymangment;

public class FullTimeEmplyoee extends Employee{
  
	private double allowance;
	private double bouns;
   
	
	public  FullTimeEmplyoee(String name,int id,double salary,double allowance,double bouns) {
		super(name,id,salary);
	
        this.allowance = allowance;
        this.bouns = bouns;
	
	}

	@Override
	public double CalculateSalary() {
	return super.getSalary()+this.allowance +this.bouns ;
		
	} 
	
	
	
	
}

