package classesandobject;

public class PuneCollegeMain {
	
	void display()
	{
		System.out.println("in display");
	}
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(PuneCollege.uniname+" "+PuneCollege.state);
		PuneCollege.setVariables();
		
		PuneCollege c1= new PuneCollege();
		PuneCollege c2= new PuneCollege();
		PuneCollege c3= new PuneCollege();
		
		System.out.println(c1.id+" "+c1.name);
		//c1.setVariables();
		
		
		//System.out.println(c1.uniname+" "+c1.state);

	}

}
