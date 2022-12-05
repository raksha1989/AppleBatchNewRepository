package forlooping;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0; 
		for(int i=1;i<=4;i++) //i=1                  i=2                     i=3             i=4
		{ ///       j<=4+3=7
			for(int j=1;j<=i+x;j++) //j=1      j=1  j=2 j=3 j=4
			{
				System.out.print(j+" "); 
			}
			x=x+1;//                    x=0+1=1           x=1+1=2         x=2+1=3
			System.out.println();
		}

	}

}
// 1
// 1 2 3
// 1 2 3 4 5
// 1 2 3 4 5 6 7