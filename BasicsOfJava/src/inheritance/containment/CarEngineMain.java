package inheritance.containment;

public class CarEngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine e1= new Engine("Tata",4,89,"1000rpm");
		
		Car c1= new Car(1001,"Zest",950000,"Blue",e1);
		
		System.out.println(c1);
		
		
		/*Engine e1= new Engine();
		e1.setRpm("1000rpm");
		e1.setCylinder(4);
		e1.setTorque(89);
		e1.setCompany("Tata");
		
		Engine e2= new Engine();
		

		
		Car c1= new Car();
		c1.setId(1001);
		c1.setName("Zest");
		c1.setPrice(950000);
		c1.setColor("Blue");
		c1.setE(e1);
		
		Car c2= new Car();
		c2.setE(e2);
		
		System.out.println("Information of car: ");
		System.out.println("Name: "+c1.getName()+" \nPrice: "+c1.getPrice()+" \nColor: "+c1.getColor() );
		System.out.println("Engine: ");
		System.out.println("Company: "+c1.getE().company);*/
	}

}
