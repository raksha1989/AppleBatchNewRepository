package classesandobject;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {//java
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a= sc.nextInt();
		b=sc.nextInt();
		Calculator c1 = new Calculator();
		c1.add(a,b);
		c1.subtract(a,b);

	}

}
