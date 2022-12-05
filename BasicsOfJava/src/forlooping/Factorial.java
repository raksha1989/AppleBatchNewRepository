package forlooping;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5,fact=1; //5*4*3*2*1
		 
		for(int i=1;i<=n;i++) //i=1     i=2          i=3              i=4           i=5          i=6
		{
			fact=fact*i;// fact=1*1=1    fact=1*2=2  fact=6        fact=6*4=24   fact=24*5=120
		}
		System.out.println("Factorial is: "+fact);

	}

}
