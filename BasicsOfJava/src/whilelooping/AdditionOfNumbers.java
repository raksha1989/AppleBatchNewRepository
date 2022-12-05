package whilelooping;

public class AdditionOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1,limit=5,sum=0,product=1,sumo=0;
		while(i<=limit)//i=1         i=2         i=3          i=4           i=5          i=6
		{
			if(i%2==0)
			{
				sum=sum+i; //sum=0+1=1  sum=1+2=3   sum=3+3=6   sum=6+4=10    sum=10+5=15
			}
			else
			{
				sumo=sumo+i;
			}
			i++;
		}
		System.out.println("Addition of even numbers is: "+sum);
		System.out.println("Addition of odd numbers is: "+sumo);
		
		i=1;
		while(i<=limit)    //    i=1      i=2         i=3      i=4        i=5        i=6
		{
			product=product*i;//p=1*1=1  p=1*2=2   p=2*3=6   p=6*4=24  p=24*5=120
			i++;
		}
		System.out.println("product is: "+product);
		

	}

}
