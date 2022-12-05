package inheriance.parentchild;

public class Father1 extends GrandFather1 {

	String fn1;

	public void setFn1(String fn1) {
		this.fn1 = fn1;
	}
	
	void display()
	{
		super.display();
		System.out.println("Father Details: ");
		System.out.println(fn1+" "+fn+" "+ln);
	}

	
}
