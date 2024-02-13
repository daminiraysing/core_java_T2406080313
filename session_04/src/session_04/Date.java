package session_04;

public class Date { 
	
	private int dd;
	private int mm;
	private int yy; 
	//private final float PI;      // either you declare this or  
	//private final float PI=3.14f; // initialize here 
	
	// public Date() // or you can initialize in default constructor
	//{
		//float PI = 3.14;
	  //}	
	
	public Date(int dd, int mm, int yy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String toString() {
		return "Date [dd=" +dd+ ", mm=" +mm+ "," +"yy=" +yy+ "]";
	} 
	
	//public static void main(String args[]) { // use of final keyword 
	  // final Date d = new Date(1,1,18);
        // d = new Date(1,2,18);  // we reassign value again 
	}

