package abstraction;

public interface Project {
	
	String compname="Infosys";  //public static final

	void requirements();  //abstract public
	void planning();
	void design();
	void development();
	void testing();
	void deployment();
	void maintainance();
	
	//Java 1.8 default methods,static methods in interface
	//1.9 private methods
	
	//void feedback();
	default void feedback()   //reduce Backward Compatibility
	{
		System.out.println("in feedback method of interface Project");
	}
	
	static void staticDemo()
	{
		//compname="ABC";
		System.out.println("Static in Interface"+compname);
	}
	
}
