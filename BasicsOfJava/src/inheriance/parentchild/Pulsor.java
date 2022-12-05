package inheriance.parentchild;

public class Pulsor extends Bike{
	
	
	void engine()
	{
		super.engine();  //immediate parent class  bike
		//gear();
		System.out.println("Pulsor Engine:  150 cc");
	}

}
