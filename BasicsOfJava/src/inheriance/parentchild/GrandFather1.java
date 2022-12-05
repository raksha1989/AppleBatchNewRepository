package inheriance.parentchild;

public class GrandFather1 {
	
	String fn,mn;
	static String ln="XYZ";
	
	
	public void setFn(String fn) {
		this.fn = fn;
	}
	
	public void setMn(String mn) {
		this.mn = mn;
	}
	
	void display()
	{
	
		System.out.println("Grandfather Details: ");
		System.out.println(fn+" "+mn+" "+ln);
	}

}
