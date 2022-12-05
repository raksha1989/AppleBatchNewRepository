package classesandobject;

public class A {
	
	
	A()
	{
		this(10,20); //constructor call shld be the first statement
		System.out.println("In simplle Constructor");
		//this(10);
	}
	
	A(int x)
	{
		this(100,200,300);
		System.out.println("In one parameter Constructor");
	}

	A(int x,int y)
	{
		this(100);
		System.out.println("In two parameter Constructor");
	}
	
	A(int x,int y,int z)
	{
		this(10,20);
		System.out.println("In 3 paratmeter Constructor");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
