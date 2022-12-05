package whilelooping;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0,i=2; //2-10 
		//boolean flag=true;
		int mid=num/2; //4
		
		while(i<=mid) //  i=2  i=3  1000  2-999   2-500
		{
			if(num%i==0)// f    t
			{
				//System.out.println("not prime");
				//flag=false;
				break;
			}
			i++;	
		}
		if(i>mid)
		{
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
		/*if(flag==false)
		{
			System.out.println("not prime ");
		}
		else
			System.out.println("prime");
		*/
		

	}

}
