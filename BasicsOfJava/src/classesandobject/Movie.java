package classesandobject;

public class Movie {
	
	int id;
	String name,producer;
	static int a;
	//what are the ways to initialize global variables?
	//constructor,method,instance block
	
	
	//where are static variables initialized??
	//constructor,static method,static block,instance block
	{
		System.out.println("in instance block 1..!!!");
		id=-1;
		name="0000";
		producer="aaaa";
		a=100;
	}
	
	{
		System.out.println("in instance block 2..!!!");
		id=-1;
		name="0000";
		producer="aaaa";
	}
	
	Movie()
	{
		System.out.println("in simple constructor..!!");
		id=-00;
		name="nnnn";
		producer="pppp";
	}
	
	void setData(int id, String name,String producer)
	{
		this.id=id;
		this.name=name;
		this.producer=producer;
		display(); //this=m1.display()   this.display()
	}
	
	
	void display()
	{
		System.out.println(id+" "+name+" "+producer);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//instance block will be called for every object creation
		//before constructor
		
		Movie m1= new Movie();
		//m1.setData(111, "Bramhastra", "Karan Johar");
		m1.display();
		
		System.out.println("\n-------------*******-------------\n");
		Movie m2= new Movie();
		m2.display();

	}

}
