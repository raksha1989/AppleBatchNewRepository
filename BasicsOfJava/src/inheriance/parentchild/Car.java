package inheriance.parentchild;

public class Car {
	
	
	String price,engine;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	void wheelno()
	{
		System.out.println("4 wheels");
	
	}
	
	void headLights()
	{
		System.out.println("2 headlights");
	}
}
