package classesandobject;

import java.util.Scanner;

public class Employee {

	int id,salary;   //0
	String name,dept;// null
	float pf;
	
	Employee()  //user define  initialize a object/no return type
	{
		id=-1;
		salary=-1;
		name="aaaa";
		dept="dddd";
		pf=-1;
	}
	
	//this represent current object in use
	Employee(int id,String name,String dept,int salary,float pf)  //user define
	{
		this.id=id;       //e4.id=id
		this.salary=salary;  //e3.salary
		this.name=name;
		this.dept=dept;
		this.pf=pf;
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("---------------------");
		Employee e3= new Employee(101,"Kajal","HR",50000,0.10f);  ///create a object
		System.out.println(e3);
		
		
		System.out.println("---------------------");
		Employee e4= new Employee(102,"Ajay","HR",70000,0.10f);  ///create a object
		System.out.println(e4);
		
		
		
		
		
	//classname var_ref= new Constructor
		/*Employee e1= new Employee();  ///create a object
		e1.display();
		
		System.out.println("---------------------");
		Employee e2= new Employee();  ///create a object
		e2.display();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id,name,dept,salary,pf: ");
		int id= sc.nextInt();*/
		
		
		
		
		/*System.out.println("---------------------");
		Employee e4= new Employee();
		e4=e3;
		System.out.println(e4);*/
		
	}
	
	void display()
	{
		//int n1,n2;
		//System.out.println(n1+" "+n2);
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+pf);
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary+" "+pf;
	}
}
