package inheriance.parentchild;

public class MyDate {
	
	int dd,mm,yy;
	static String month="November";

	
	private void display()
	{
		System.out.println("in display method");
	}
	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	
}
