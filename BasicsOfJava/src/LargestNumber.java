import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 4 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		if(a>=b && a>=c && a>=d)
			System.out.println(a+" is greatest of all");
		else if(b>=a && b>=c && b>=d)
			System.out.println(b+" is greatest of all");
		else if(c>=a && c>=b && c>=d)
			System.out.println(c+" is greatest of all");
		else
			System.out.println(d+" is greatest of all");
		
		
		sc.close();
	}
}
