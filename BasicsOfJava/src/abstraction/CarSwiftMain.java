package abstraction;

public class CarSwiftMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Swift s1= new Swift(); 
		
		Swift s= new SwiftDezire(); //upcasting
		
		s.wheeloNo();
		s.dashBoard();
		s.buildQuality();
		s.headLightsNo();
		s.safetyFeatures();
		s.alloyWheels();
		
		s.setData("1000 cc", 700000);
		s.displayInfo();

	}

}
