package inheriance.parentchild;

public class DateTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//do not create 
		/*MyDate md= new MyDate();
		md.setDd(28);*/
		
		MyTime mt= new MyTime();
		mt.setHrs(11);
		mt.setMins(10);
		mt.setSecs(49);
		
		mt.setDd(28);
		mt.setMm(11);
		mt.setYy(2022);
		
		//mt.display();
		
		mt.displayDateTime();
		System.out.println(MyTime.month);
		

	}

}
