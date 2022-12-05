package inheritance.containment;

public class College {
	
	private int code;
	private String name,address;
	
	Department dept; //reference object
	Library lib;
	
	public void setDept(Department dept)
	{
		this.dept=dept;
	}
	
	public Department getDept()
	{
		return dept;
	}
	
	public void setLib(Library lib)
	{
		this.lib=lib;
	}
	
	public Library getLib()
	{
		return lib;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
