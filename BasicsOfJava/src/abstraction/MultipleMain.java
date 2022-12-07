package abstraction;

//one interface can extends another interface
interface A
{
	void add(int a,int b);
	void multiply(int a,int b);
	void sqrt(int a);
}
//implementing child interface ...given implementation to child as well as parent methods
//implementing parent interface ...only give implementation to parent method

interface B  //parent interface
{
	void square(int a);
	void sqrt(int a);
}

class  ABC 
{
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void substract(int a,int b)
	{
		System.out.println("Substraction is: "+(a-b));
	}
	
	/*public void square(int a)
	{
		System.out.println("Square is: "+(a*a));
	}*/
	
	public void sqrt(int a)
	{
		System.out.println("Square root is: "+Math.sqrt(a));
	}
	
}

class DEF extends ABC implements A,B
{

	/*public void sqrt(int a)
	{
		System.out.println("Square root in DEF: "+Math.sqrt(a));
	}*/
	
	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println("Square is: "+(a*a));
		
	}

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.println("Multiplication is: "+(a*b));
			
	}
	
}

public class MultipleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ABC obj= new ABC();
		obj.add(100, 200);
		obj.sqrt(25);*/
		
		DEF obj1= new DEF();
		obj1.add(100, 200);
		obj1.square(20);
		obj1.sqrt(625);
	}

}
