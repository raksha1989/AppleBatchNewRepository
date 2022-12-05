package classesandobject;

import java.util.Scanner;

public class BonusPFCalculator {
	
	float bonus()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the salary, rating(A/B/C/D) of the employee: ");
		int salary=sc.nextInt();
		char ch=sc.next().charAt(0);
		float newSal;
		System.out.println("Original Salary: "+salary);
		
		if(ch=='A')
			newSal=salary+(salary*0.15f);
		else if(ch=='B')
			newSal=salary+(salary*0.10f);
		else if(ch=='C')
			newSal=salary+(salary*0.05f);
		else
			newSal=salary;
		
		System.out.println("Salary after adding bonus: "+newSal);
		
		return newSal;
		//System.out.println("hello");
	}
	
	
	void pfCalculator(float salary)
	{
		bonus();
		float pf= salary*0.10f;
		System.out.println("pf: "+pf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the salary, rating(A/B/C/D) of the employee: ");
		int salary=sc.nextInt();
		char ch=sc.next().charAt(0);*/
		BonusPFCalculator bpc= new  BonusPFCalculator();
		float newSal= bpc.bonus(); //return
		 
		 bpc.pfCalculator(50000); 
		 //bpc.pfCalculator(bpc.bonus(sal, r));
		

	}

}
