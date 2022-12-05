package whilelooping;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit=20,c=0;
		
		while(c<=limit) //c=1  c=2  c=3 c=4
		{
			c++;
			if(c%6==0) // f     f   t
			{
				//c++;
				//continue;
				break;
			}
		
			System.out.print(c+" ");
		}
		System.out.println("out of while loop "+c);

	}

}
