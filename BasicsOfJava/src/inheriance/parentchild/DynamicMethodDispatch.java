package inheriance.parentchild;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f= new Fruit();
		f.taste();
		
		f=new Apple(); //upcasting
		f.taste();

		f= new Strawberry();
		f.taste();
		
		
		/*Apple a=  new Fruit(); ///downcasting
		a.taste();*/
	}

}
