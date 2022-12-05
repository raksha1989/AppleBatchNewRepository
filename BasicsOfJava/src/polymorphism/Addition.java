package polymorphism;

public class Addition {
	
	
	void add(int a,int b)  //add(int,int)
	{
		
		System.out.println("'Addition of 2 numbers is:  "+(a+b));
	}
	
	/*void add(int c,int d) //add(int,int)
	{
		
		System.out.println("'Addition of 2 numbers is:  "+(a+b));
	}*/
	
	
	void add(int a,int b,int c)//diff no of parameters  add(int,int,int)
	{
		
		System.out.println("'Addition of 3 numbers is:  "+(a+b+c));
	}

	void add(String a,String b) //diff type of parameters
	{
		
		System.out.println("'Addition of 2 Strings is:  "+(a+b));
	}
	
	void add(int a,String b) //diff type of parameters  add(int,String)
	{
		
		System.out.println("'Addition of int and string is:  "+(a+b));
	}
	
	void add(String a, int b) //diff sequence  add(String,int)
	{
		
		System.out.println("'Addition of string and int is:  "+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a1= new Addition();
		
		a1.add(10, 20);
		a1.add("ABC", 90);
		//a1.add(100.5f,76.4f);
		a1.add("ABC", "XYZ");
		

	}

}
