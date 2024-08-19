package salarymangment;

public class Mainapp {

	public static void main(String[] args) {
	
	            FullTimeEmplyoee Emp1 = new FullTimeEmplyoee("John Doe ",12,200000,2000,2000);
	            PartTimeEmployee Emp2 = new PartTimeEmployee("Jane Smith ",05,0.0,20,20000);
	            ContractEmployee Emp3 = new ContractEmployee(" Mark Johnson ",11,0.0,2,400000);
	    
	               Emp1.display();
	               Emp2.display();
	               Emp3.display();
	
	}
	
}


