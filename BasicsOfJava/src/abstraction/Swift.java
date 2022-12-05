package abstraction;

public class Swift extends Car{
	
	
	void setData(String engine,int price)
	{
		this.price=price;
		this.engine=engine;
	}
	
	void displayInfo()
	{
		System.out.println(price+" "+engine);
	}
	void dashboard()
	{
		System.out.println("Swift has:  Ac,Music System, Screen");
	}
	
	void safetyFeatures()
	{
		System.out.println("Swift: AirBags, Child Lock");
	}
	
	void buildQuality()
	{
		System.out.println("Swift: 3 star rated");
	}

}
