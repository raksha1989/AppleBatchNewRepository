package inheriance.parentchild;

public class Student extends Person{
	
	int rollno,marks; //default values
	
	Student()
	{
		name="name";
		age=-1;
		contact="contact";
		rollno=-1;
		marks=-1;
		
	}
	
	void setStudentData()
	{
		System.out.println(name+" "+age+" "+contact);
		System.out.println(rollno+" "+marks);
	}

}
