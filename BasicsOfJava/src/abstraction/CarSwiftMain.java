package abstraction;

public class CarSwiftMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swift s= new Swift(); //child
		
		s.wheeloNo();
		s.dashboard();
		s.buildQuality();
		s.headLightsNo();
		s.safetyFeatures();
		
		s.setData("1000 cc", 700000);
		s.displayInfo();

	}

}
