package encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		//System.out.println(e1.id);
		e1.setId(101);
		e1.setName("Rahul");
		e1.setDept("Development");
		e1.setSalary(70000);
		
		
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getSalary());

	}

}
