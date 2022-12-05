package forlooping;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=4;
		 
		for(int i=1;i<=row;i++)//         i=1        i=2              i=3               i=4               i=5
		{
			for(int j=1;j<=i;j++)  //   j=1 j=2   j=1 j=2 j=3    j=1 j=2 j=3 j=4   j=1 j=2 j=3 j=4 j=5
			{
				System.out.print("*");// *
			}                         // **
			System.out.println();     // ***
		}                             // ****
		
		
		System.out.println("\n-----------Downward Pattern-------\n");
		
		for(int i=row;i>=1;i--) //         i=4                     i=3                i=2            i=1
		{
			for(int j=1;j<=i;j++) // j=1 j=2 j=3 j=4 j=5   j=1 j=2 j=3 j=4
			{
				System.out.print("*");//****
			}                         //***
			System.out.println();     //**
		}                             //*
                                      
	}

}
