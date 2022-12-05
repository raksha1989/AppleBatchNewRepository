package inheriance.parentchild;

class A
{
	int a;
	void display()
	{
		int c=0,d=0;
		System.out.println(a);
		System.out.println(c+" "+d);
	}
	
}

class B extends A
{
	int b;
}

class C extends B
{
	int c;
}

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent class default constructor
		
		C c1= new C(); //parent class default constructor is called first

	}

}
