package inheriance.parentchild;

public class CarAudiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AudiQ8 aq= new AudiQ8();
		aq.setPrice("1.4 Cr");
		aq.setEngine("V8 turbo Engine");
		aq.wheelno(); //Car
		aq.headLights(); //car
		aq.seatWarmer(); //Audi
		aq.autoWiper(); //AudiQ8
		System.out.println(aq.getPrice()+" "+aq.getEngine());
		

	}

}
