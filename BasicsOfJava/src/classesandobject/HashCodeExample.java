package classesandobject;

public class HashCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Student s1= new Student();
		s1.setData(101, "raj", "Computer", 70);
		Student s2= new Student();
		s2.setData(102, "Riya", "Computer",65);
		
		System.out.println(s1.hashCode());// Object
		System.out.println(s2.hashCode());
		
		/*//s2=s1;
		
		System.out.println("--------------------------\n");
		
		System.out.println(s1.hashCode());// Object
		System.out.println(s2.hashCode());
		*/
		/*s1.display();
		s2.display();*/
		
		//s1.toString()     Object
	    System.out.println(s1);
	  //  System.out.println(s2);
	    
	    
	    //Annonymous Object
	    System.out.println("\n-----------------");
	    
	    new Student().display();
	    

	}

}
