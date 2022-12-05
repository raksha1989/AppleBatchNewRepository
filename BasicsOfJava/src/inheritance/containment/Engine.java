package inheritance.containment;

public class Engine {
	
	int cylinder,torque;
	String rpm,company;
	
	
	Engine(String company,int cylinder,int torque,String rpm)
	{
		this.rpm=rpm;
		this.company=company;
		this.cylinder=cylinder;
		this.torque=torque;
	}
	
	
	public String toString()
	{
		return "Company: "+ company+"\nRPM: "+rpm+" "+cylinder+"cylinder "+torque+"nanometer";
	}
	
	/*public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	public String getRpm() {
		return rpm;
	}
	public void setRpm(String rpm) {
		this.rpm = rpm;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}*/
	
	

}
