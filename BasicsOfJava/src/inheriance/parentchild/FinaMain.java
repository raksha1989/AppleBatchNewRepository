package inheriance.parentchild;


//final can be used with variable,method,class

//final,finally,finalize

class Aa  //final class cannot be inherited
{
	final int a=100; //constant
	static String city="Aurangabad";
	
	final void display() //that method cannot be overridden
	{
		
		System.out.println("In displayy metod...!!  "+a);
	}
}

class Bb extends Aa
{
	void display1()
	{
		//a=200;
		city="Sambhaji Nagar";
		System.out.println("In B class displayy method...!!  "+a);
	}
	
}
public class FinaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bb obj= new Bb();
		obj.display1();
		System.out.println(Aa.city);
	}

}
