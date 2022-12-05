package classesandobject;

import java.util.Scanner;

public class GooglePay {
	
	//               10000
	void withdraw(int amount,Account acc) //passing object as a parameter
	{
		int accbal=acc.getBalance(); //50000
		
		if(accbal>amount)  //50000>10000
		{
			accbal=accbal-amount;  //accbal=50000-10000
			acc.setBalance(accbal);
		}
		else
			System.out.println("Low Balance..try after some time...!!!!");
	}
	
	//deposit();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1= new Account();
		a1.setId(101);
		a1.setAccno(9999);
		a1.setBalance(50000);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to withdraw: ");
		int amt= sc.nextInt();
		
		GooglePay gp= new GooglePay();
		gp.withdraw(amt, a1); //10000
		
		System.out.println("Amount withdrawn; Total Balance: "+a1.getBalance());
		
		Account a2= new Account();
		
	}

}
