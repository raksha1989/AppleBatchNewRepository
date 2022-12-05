package inheriance.parentchild;

public class ChildMain extends Father1{
	
	String fn2;

	public void setFn2(String fn2) {
		this.fn2 = fn2;
	}
	
	void display()
	{
		super.display();
		System.out.println("Child Details: ");
		System.out.println(fn2+" "+fn1+" "+ln);
	}
	
	public static void main(String[] args) {
		
		
		ChildMain c=  new ChildMain();
		c.setFn("Ramesh");
		c.setMn("DEF");
		c.setFn1("Ankush");
		c.setFn2("Raj");
		
		c.display();
				
	}


}
