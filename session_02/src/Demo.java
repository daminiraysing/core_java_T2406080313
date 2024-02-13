
public class Demo {
 private int day,month,year;
 public int getDay()
 {
	 return day;
 }
 
 public void setDay(int d)
 {
	 day=d;
 }
 
 public static void main(String args[]) {
	 Demo d= new Demo();
	 d.setDay(7);
	 int a=d.getDay();
	 System.out.println("Day="+a);
	 System.out.println("Day="+d.getDay());
 }
}
