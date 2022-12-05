package forlooping;

public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(char i='a';i<='d';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
