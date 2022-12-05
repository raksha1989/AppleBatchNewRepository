package forlooping;

public class ArmstrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//153=1^3+5^3+3^3=153
		
		
		int num=153,cnt=0,sum=0;
		int temp=num;
		
		while(temp!=0)  //   temp=153             temp=15    temp=1   temp=0
		{
			//int r=temp%10;
			cnt++;   //      cnt=1                 cnt=2   cnt=3
			temp=temp/10;//   temp=temp/10=15     temp=1    temp=0
		}
		
		//System.out.println(cnt);
		
		int temp1=num;    //reinitialize temp=153
		
		while(temp1!=0) //                 temp1=153                              temp1=15                                   temp1=1            temp=0
		{
			int power=1;      //          power=1                                 power=1
			
			int r=temp1%10;  //               r=3                                  r=5
			
			for(int i=1;i<=cnt;i++)//   i=1   i=2    i=3    i=4             i=1     i=2      i=3      i=4
			{
				power=power*r;//     p=1*3=3 p=3*3=9 p=9*3=27             p=1*5=5  p=5*5=25 p=25*5=125
			}
			sum=sum+power;  //                             sum=0+27=27                              sum=27+125=152        sum=152+1=153
			temp1=temp1/10;//                              temp1=153/10=15                           temp1=1               temp1=0 
		}
		
		if(sum==num)
			System.out.println("Armstrong number");
		else
			System.out.println("not armstrong number");

	}

}
