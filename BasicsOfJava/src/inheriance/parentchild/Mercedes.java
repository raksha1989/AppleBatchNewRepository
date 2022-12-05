package inheriance.parentchild;

public class Mercedes extends Car1
{
	static void display()
	{
		System.out.println("in display method in mercedes");
	}
	
	void dashboard()
	{
		//super.dashboard();
		System.out.println(" Screen");
		super.dashboard();   //will always represent immediate parent class
	}
	
	
	void enginePower()
	{
		//super.wheelno();
		System.out.println("Mercedes: 11906 cc");
	}
	

}
