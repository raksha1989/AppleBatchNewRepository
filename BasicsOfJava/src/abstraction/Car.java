package abstraction;

public abstract class Car { //cannot create object of abstract class

	int price;
	String engine;
	
	//constructors are allowed in abstract class
	
	void wheeloNo()  //concrete methods
	{
		System.out.println("Every car has 4 wheels");
	}
	
	void headLightsNo()
	{
		System.out.println("there are 2 headlights");
	}
	
	/*void headLightsNo(int a)
	{
		System.out.println("there are 2 headlights");
	}*/
	
	abstract void dashboard();
	abstract void safetyFeatures();
	abstract void buildQuality();
	
}
