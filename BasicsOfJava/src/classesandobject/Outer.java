package classesandobject;

public class Outer {
	
	int a=10;
	static int b=20;
	
	static class Inner
	{
		void display()
		{
			System.out.println(a+" "+b);
		}
	}
	
	

}
