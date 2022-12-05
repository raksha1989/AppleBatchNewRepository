package classesandobject;

import java.util.Scanner;

public class Student1 {
	
	int id,marks;
	String name,dept;
	
	void setData()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of studnts; ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("Entere data for "+i+" Student: ");
			System.out.println("Enter the id: ");
			int sid=sc.nextInt(); //101
			System.out.println("Enter the name: ");
			String sname=sc.next(); //Rahul
			System.out.println("Enter the marks: ");
			int smarks=sc.nextInt(); //70
			System.out.println(" Enter the dept: ");
			String sdept=sc.next(); //Civil
			
			Student s1= new Student();
			s1.display();
		}
		
		
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s= new Student1();
		s.setData();

	}

}
