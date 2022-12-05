package forlooping;

public class FirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
		
		int n=10;
		
		for(int i=1;i<=n;i*=2)  //  i=1  i=2 i=3  i=4  i=5 i=6 //local
		{
			System.out.print(i+" "); //1 2  3 4 5
			//i++;
			//System.out.printl(a+" ");
		}
		
		System.out.println("Done");

	}

}
