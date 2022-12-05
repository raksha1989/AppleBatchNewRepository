package whilelooping;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char ch;

		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("Enter two numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("addition is: " + (a + b));
			System.out.println("Do you wnat to continue???(y/n): ");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

	}

}
