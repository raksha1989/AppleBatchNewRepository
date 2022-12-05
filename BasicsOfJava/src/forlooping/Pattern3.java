package forlooping;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c;
		//int x=0;
		for(int i=1;i<=5;i++)//i=1                i=2              i=3
		{       // j<=2*3-1=6-1=5
			for(int j=1;j<=2*i-1;j++)// j=1     j=1 j=2 j=3
			{
				System.out.print(a+" ");
				c=a+b;
				a=b;
				b=c;
			}
			a=0;
			b=1;
			//x=x+1;
			System.out.println();
		}

	}

}
/*
0
0 1 1
0 1 1 2 3
*/

