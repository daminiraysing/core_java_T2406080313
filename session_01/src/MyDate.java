
public class MyDate {
     
	private int dd,mm,yy;  // instance variable 
	
	public void initDate()
	{
		dd=mm=yy=1;
	}
	public void setDate(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void displayDate()
	{
		System.out.println("Date= ["+dd+"/"+mm+"/"+yy+"]" );
	}
	
	public static void main(String args[]) {
		//date d; // reference variable 
		MyDate d = new MyDate();
		System.out.println(d.dd);
		d.initDate();
		d.setDate(06, 02, 2024);
		d.displayDate();
	}
}
