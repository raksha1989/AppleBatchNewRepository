package inheriance.parentchild;

public class FatherSonDaugtherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Son s= new Son();
		s.setName("Ramesh");
		s.setAge(25);
		
		System.out.println("Son Information: ");
		System.out.println(s.getName()+" "+Son.surname+" "+s.age);
		s.education();
		s.adddress();

	}

}

/*person
student   Faculty


person
doctor  patient

Animal
dog    cat

Employee
manager   Developer
Sales Admin project

Sports
Cricket  Hockey
ODI

electronic
Laptop   Television
3Dlaptop    led lcd


Dance
bharatnatyam kathak
*/
