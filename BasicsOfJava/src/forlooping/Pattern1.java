package forlooping;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//    9
		//   89
		//  789
		
		int r=9;
		
		for(int i=r;i>=1;i--)//          i=9      i=8          i=7               i=6              i=5
		{//    r-1=8
			for(int l=1;l<=i;l++)//  l=1        l=1->8       l=1->7           l=1->6
			{
				System.out.print(" ");
			}                    // r-1=8
			for(int y=i;y<=r;y++)// y=9       y=8 y=9     y=7 y=8 y=9   y=6 y=7 y=8 y=9
			{
				System.out.print(y);
			}                      
			for(int x=r-1;x>=i;x--) // x=9      x=9 x=8 x=7  x=9 x=8 x=7 x=6  x=9 x=8 x=7 x=6 x=5 
			{                      
				System.out.print(x);
			}                       
			System.out.println();   
		}                           

	}

}

//_________9
//________898
//_______78987
//______6789876
//