package whilelooping;

public class AdditionOfDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=585,sum=0,product=1,cnt=0,rev=0; // num%10 345%10= 5
		int temp=num;
		
		/*while(num!=0)  //  num=345         num=34           num=3       num=0
		{
			int r=num%10;//r=345%10=5      r=34%10=4       r=3%10=3
			//sum=sum+r; //sum=0+5=5         sum=5+4=9      sum=9+3=12
			//product=product*r;
			cnt++;
			num=num/10;  //num=345/10=34   num=34/10=3    num=3/10= 0
		}*/
		
		
		while(num!=0)  //  num=345         num=34           num=3       num=0
		{
			int r=num%10;//r=345%10=5      r=34%10=4       r=3%10=3
			rev=rev*10+r;
			num=num/10;  //num=345/10=34   num=34/10=3    num=3/10= 0
		}
		System.out.println(rev);
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
		
		
		
		
		/*int min=num%10;// 8
		int max=num%10; // 345768%10= 8
		
		while(num!=0)//    num=345768    num=34576    num=3457   num=345    num=34     num=3    num=0
		{
			int r= num%10;//r=8          r=6         r=7         r=5         r=4       r=3
			if(r<min)  //    			r<min      r<min       r<min        r<min       r,min
			{
				min=r;//               min=6                   min=5        min=4     min=3
			}
			if(r>max)
			{
				max=r;
			}
				num=num/10; //num=34576   num=3457    num=345    num=34        num=3      nom=0
		}
		System.out.println("minimum digit is: "+min);
		System.out.println("maximum digit is: "+max);*/
		
		
		/*while(num!=0)
		{
			int r= num%10;
			if(r%2==0)
			{
				sum=sum+r;
			}
			num=num/10;
		}*/
		
		//System.out.println("Addition is: "+sum);

	}

}
