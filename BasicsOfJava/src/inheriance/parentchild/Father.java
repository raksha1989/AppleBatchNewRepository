package inheriance.parentchild;

public class Father {
	
	String name;
	int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static String surname="Xyz";
	
	void adddress()
	{
		System.out.println("Staying at pune.!!!");
	}

}
