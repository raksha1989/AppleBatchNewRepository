package classesandobject;

import java.util.Scanner;

public class Student {
	
	//reference variable, direct initialization
	//method
	//constructor
	
	
	int id,marks;
	String name,dept;
	
	void setData(int i,String n,String d,int m)
	{
		id=i;
		name=n;
		dept=d;
		marks=m;
		
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id: ");
		id=sc.nextInt(); //initialized the global variables  via method
		System.out.println("Enter the name: ");
		name=sc.next();
		System.out.println("Enter the marks: ");
		marks=sc.nextInt();
		System.out.println(" Enter the dept: ");
		dept=sc.next();
*/	}
	
	void display()
	{
		//System.out.println(id+" "+name+" "+dept+" "+marks);
		System.out.println("In display method");
	}
	
	public String toString() 
	{
		//System.out.println("In toString method:");
		return "ID: "+id+"\nNAME: "+name+"\nDEPT: "+dept+"\nMarks: "+marks;
	}
	
	/*public String toString()  // float f=67.5f
	{
		//System.out.println("In toString method:");
		return 67.5;// email213@gmail.com
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			float smarks=sc.nextFloat(); //70
			System.out.println(" Enter the dept: ");
			String sdept=sc.next(); //Civil
			
			Student s1= new Student();
			s1.setData(sid, sname,sdept,smarks);//
			//s1.display();
		}
		
				
		/*Student s2= new Student();
		System.out.println("Enter the id: ");
		sid=sc.nextInt(); // 102
		System.out.println("Enter the name: ");
		sname=sc.next(); //lina
		System.out.println("Enter the marks: ");
		smarks=sc.nextInt(); //65
		System.out.println(" Enter the dept: ");
		sdept=sc.next(); //entc
		s2.setData(sid, sname, sdept, smarks);
		
		
		s1.display();
		s2.display();*/
		
		
		
		
		/*s1.id=101; //
		s1.name="Riya";
		s1.marks=75;
		s1.dept="ENTC";
		s1.setData();
	
		//s1.setData();
		Student s2= new Student();
		//s2.setData();
		Student s3= new Student();
		//s3.setData();
		
		s1.display();
		//s2.display();
		//s3.display();
*/		

	}

}
