package classesandobject;

public class CalculatePercentage {
	
	float tot;
	//             90    85     80
	void total(int s1,int s2,int s3)
	{
		tot= s1+s2+s3;// 90+85+80
		//float mul=s1*s2*s3;
		//return tot;
	}
	
	void percentage()
	{
		float percent=tot/3;
		System.out.println("Percentage is: "+percent+" %");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1=90,m2=85,m3=80;
		CalculatePercentage c1= new CalculatePercentage();
		c1.total(m1, m2, m3);//90,85,80
		c1.percentage();

	}

}
