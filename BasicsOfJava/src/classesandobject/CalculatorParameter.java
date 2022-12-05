package classesandobject;

import java.util.Scanner;

public class CalculatorParameter {
	//        100    200
	void add(int x, float y)
	{
		System.out.println("addition is: "+(x+y));
	}
	//              10    20
	void multiply(int a,int b)
	{
		System.out.println("Multiplication is: "+a*b);
	}
	
	/*void divide
	void substract*/
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		 CalculatorParameter c1= new  CalculatorParameter();
		 c1.add(a, b); //int
		 c1.multiply(a, b);
		 
		 //c1.add(100.5f, 30);
		
	}

}
