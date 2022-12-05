package forlooping;

public class DescendingNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=9;
		
		for(int i=r;i>=1;i--)
		{
			for(int l=1;l<=i;l++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=r;k++)
			{
				System.out.print(k);
			}
			for(int j=r-1;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
