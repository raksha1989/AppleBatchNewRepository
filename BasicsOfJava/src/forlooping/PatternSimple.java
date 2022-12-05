package forlooping;

public class PatternSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		//a
		//ab
		//abc
		//abcd
		//abcde
		
		//abcde
		//abcd
		//abc
		//
		
		for(int i=1;i<=5;i++)        
		{
			char  ch='A'; //a=97  A=65	
			//int x=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
				ch++;
				//x++;
			}
			System.out.println();
		}
		
		System.out.println("\n---------*****-----\n");
		
		//abcde
		//abcd
		//abc
		//ab
		//a
		
		//edcba
		//dcba
		//cba
		//ba
		//a
		
		//a
		//ac
		//ace
		//aceg
		//acegi
		
		
		
		for(int i=5;i>=1;i--)
		{
			//char c='a';
			int x=96;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+x)+" ");
				//c--;
				x++;
			}
			System.out.println();
			
		}
		*/
		
		/*a
		aba
		abcba
		abcdcba*/
		

	/*	for(int i=1;i<=5;i++)        //i=1    //i=3
		{
			char  ch='A'; //a=97  A=65	
			
			for(int j=1;j<=i;j++)//j=1      j=1 j=2 j=3 j=4
			{
				System.out.print(ch);//A   abcba
				ch++;//     ch=B            ch=d
			}
			//ch=d
			ch--;//ch=c
			for(int k=i-1;k>=1;k--) //      k=2 k=1 k=0
			{
				ch--;               //      ch=b   ch=a
				System.out.print(ch);
				//ch--;
				
			}
			System.out.println();
		}*/
		
		//1   5
		//12 45
		//12345
		int y=5;
		int r=3;
		for(int i=1;i<=r;i++)
		{
			//int x=0;
			for(int j=1;j<=i;j++)
			{	
				System.out.print(j);
			}
			
			for(int k=1;k<=r;k++)
			{
				System.out.print(" ");
				
			}
			for(int l=y;l<=5;l++)
			{
				System.out.print(l);
			}
			
			y--;
			System.out.println();
			//x++;
			
		}
		
		
		
		
		
		
		/*a
		bb
		ccc
		dddd
		eeeee*/
		
		/*a                      1
		ab                       12
		abc                      123
		abcd                     1234
		abcde                    12345*/

		/*for(char ch='A';ch<='E';ch++)
		{
			for(char j='A';j<=ch;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
*/
	}

}
