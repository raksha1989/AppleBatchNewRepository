package encapsulation;

//POJO CLASS - Plain old java object
public class Employee {
	
	//default
	private int id,salary;
	private String name,dept,contact;
	
	//public getters setters
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	public String getDept()
	{
		return dept;
	}

}
