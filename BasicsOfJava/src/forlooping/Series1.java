package forlooping;

// 1 2 6 15 31 56
//  1^2 2^2 3^2
public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 2 6 15 31 56 sq
		// 1 2 6 33 289 
		int j=1;
		for(int i=1;i<=6;i++)
		{
			System.out.print(j+" ");
			j=j+(i*i);
		}
		System.out.println();
		
		
		
		//1  5  13  25  41  61
		// 4*1  4*2  4*3
		int k=4,l=1;
		for(int i=1;i<=6;i++)
		{
			System.out.print(l+" ");
			l=l+k*i;	
		}

	}

}
