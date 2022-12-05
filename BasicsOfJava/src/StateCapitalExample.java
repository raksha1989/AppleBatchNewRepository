import java.util.Scanner;

public class StateCapitalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a State name");

		//sname=sc.next(); //one word input
		sname = sc.nextLine(); /// can take a complete line as input
		
		sname= sname.toLowerCase(); //sname=maharashtra
		
		switch (sname) {
		case "maharashtra":
			System.out.println("Capital is Mumbai");
			break;
			
		case "goa":
			System.out.println("Capital is Panaji");
			break;
			
		case "gujarat":
			System.out.println("Capital is Gandhinagar");
			break;

		case "madhya pradesh":
			System.out.println("Capital is Bhopal");
			break;

		case "karnataka":
			System.out.println("Capital is Bangalore");
			break;

		case "telangana":
			System.out.println("Capital is Hyderabad");
			break;

		case "uttar pradesh":
			System.out.println("Capital is Lucknow");
			break;

		case "jharkhand":
			System.out.println("Capital is Ranchi");
			break;

		case "jammu and kashmir":
			System.out.println("Capital is Srinagar");
			break;

		default:
			System.out.println("Enter a valid input");

		}

	}

}
