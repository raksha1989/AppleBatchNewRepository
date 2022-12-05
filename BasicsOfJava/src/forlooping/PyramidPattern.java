package forlooping;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=4;
		
		for(int i=1;i<=r;i++)   //       i=1               i=2             i=3             i=4
		{//                 0
			for(int k=1;k<=r-i;k++)// k=1 k=2 k=3 k=4   k=1 k=2 k=3      k=1 k=2        k=1
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) //     j=1 j=2
			{
				System.out.print("* ");//___* 
			}                          //__* *
			System.out.println();      //_* * *
		}                              //* * * *
		
		for(int i=3;i>=1;i--)
		{
			for(int k=1;k<=r-i;k++)// k=1 k=2 k=3 k=4   k=1 k=2 k=3      k=1 k=2        k=1
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) //     j=1 j=2
			{
				System.out.print("* ");//___* 
			}                          //__* *
			System.out.println();
		}

	}

}
