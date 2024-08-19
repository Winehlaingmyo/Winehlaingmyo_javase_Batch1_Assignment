package salarymangment;

public class ContractEmployee extends Employee{
    int contractDuration;
	int contractAmount;
	
	public ContractEmployee(String name, int Empid, double salary,int contractDuration, int contractAmount) {
		super(name, Empid, salary);
		this.contractAmount = contractAmount;
		this.contractDuration = contractDuration;
		
		
		
	}

	@Override
	
	public double CalculateSalary() {
		
		return this.contractAmount /this.contractDuration ;
		
		
	}
	
	
	
}
