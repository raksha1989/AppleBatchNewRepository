package package1;

public class Test2 extends Test1{
	
	public void display() //default
	{
		System.out.println("In test2 Display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 t1= new Test2();
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);

	}

}
