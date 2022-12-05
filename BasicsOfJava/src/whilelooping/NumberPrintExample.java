package whilelooping;

import java.util.Scanner;

public class NumberPrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1,limit;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit: ");
		limit=sc.nextInt();
		while(i<=limit)//                  i=1   i=2  i=3   i=4  i=5 i=6
		{
			System.out.print(i+" ");// 1  2   3  4  5 Done
			i++;
		}
		//i++;  infinite loop
		
		System.out.println("Done");
		sc.close();

	}

}
