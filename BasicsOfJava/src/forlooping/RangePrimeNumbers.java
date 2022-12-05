package forlooping;

public class RangePrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		for(int i=400;i>=200;i--)
		{
			int mid=i/2,j;
			for( j=2;j<=mid;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j>mid)
			{
				System.out.println(i);
			}
		}

	}

}
