package classesandobject;

public class StaticBlockExample {
	int a;
	static int count;
	
	//executed before main method, use to initialize only static variable
	static
	{
		//a=10;
		count++;
		System.out.println("In Static Block 1");
	}
	
	static
	{
		count++;
		System.out.println("In Static Block 2");
	}
	static
	{
		System.out.println("in static block 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(StaticBlockExample.count);

	}

}
