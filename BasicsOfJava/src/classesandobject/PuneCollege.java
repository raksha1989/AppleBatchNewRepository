package classesandobject;

public class PuneCollege {
	
	int id,dno,studno;
	String name,location; 
	static String uniname;  //class variable
	static String state="Maharashtra";
	//initialize static variables: static method,constructor,simple method, static block
	
	//c1.setData()
	//nonstatic: can access static as well as non static directly
	void setData()
	{
		 System.out.println(state+" "+id);//c1.id
	}
	
	//static :can can access static directly/to access non static it requires an object
	
	static void setVariables() //class method
	{
		uniname="Pune University"; //initialize only static variables
		System.out.println("inside static method");
		
		PuneCollege c5= new PuneCollege();
		c5.id=101;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(uniname+" "+state);
		PuneCollege.setVariables();
		
		PuneCollege c1= new PuneCollege();
		PuneCollege c2= new PuneCollege();
		PuneCollege c3= new PuneCollege();
		
		System.out.println(c1.id+" "+c1.name);
		//c1.setVariables();
		
		c1.setData();
		
		//System.out.println(c1.uniname+" "+c1.state);

	}


	

}
