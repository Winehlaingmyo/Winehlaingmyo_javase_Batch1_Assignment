package animaldata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainapp {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		 
		animal[] animalArray = new animal[50];
		String flag;
		 
		do {
			System.out.print("Enter Animal Name : ");
			String name = br.readLine();
			System.out.print("Enter Animal Age : ");
			int age = Integer.parseInt(br.readLine());
			System.out.print("Enter Animal Specis : ");
			String specis = br.readLine();
			
           animal ani = new animal();
        
           ani.name = name;
           ani.age = age;
           ani.specis =specis;
           
         
           animalArray[animal.anicount] =ani;
           animal.anicount++;
           
           System.out.print("Do you want to enter another animal yes/no : ");
           flag =br.readLine();
           
		}while(flag.equalsIgnoreCase("yes"));
		
		  System.out.println("Total number of animals : "+animal.anicount);
		
		for (int i=0; i<animal.anicount;i++)	{
	
			System.out.println("Animal = " + ++animal.count);
		      animalArray[i].display();
		}
			
			


		
	}

}
