package classesandobject;

import java.util.Scanner;

public class Car {
	
	int speed,price;
	String name,color,mop;
	
	void setData()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name, price,speed,color,mode of Payment(online/Cash): ");
		name=sc.next();
		price=sc.nextInt();
		speed=sc.nextInt();
		color=sc.next();
		mop=sc.next();
		
		
		
		/*
		name=n;
		price=p;
		speed=s;
		color=c;
		mop=mop1;*/
	}
	
	void discount()
	{
		//System.out.println(name+" "+price);
		float discount;
		System.out.println("Mode of Payment: "+mop);
		if(mop.equalsIgnoreCase("Online"))
		{
			discount= price*0.07f;
			System.out.println("Discount is; "+discount);
			System.out.println("new Price: "+(price-discount));
		}
	}
	void display()
	{
		System.out.println(name+" "+price+" "+color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car c1= new Car();
		c1.setData();
		c1.display();
		c1.discount();
		

	}

}
