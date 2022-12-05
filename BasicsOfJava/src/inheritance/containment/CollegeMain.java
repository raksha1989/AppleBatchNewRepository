package inheritance.containment;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faculty f1= new Faculty();
		f1.setId(111);
		f1.setName("Mr. Ramesh");
		f1.setSalary(50000);
		
		Department d1= new Department();  //Aggregation
		d1.setId(1000);
		d1.setName("Computer");
		d1.setFac(f1);
		
		Library l1= new Library();
		l1.setNoofbooks(1000);
		l1.setIncharge("Mr. Aakash");
		
		College c1= new College();
		c1.setCode(54321);
		c1.setName("DYPatil COE");
		c1.setAddress("Pune");
		c1.setDept(d1);
		c1.setLib(l1);
		
		System.out.println(c1);

	}

}
