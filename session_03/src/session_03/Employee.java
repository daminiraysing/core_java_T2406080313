package session_03;

public class Employee {

	private int empno;
	private float salary;
	private float totalsal;
	public static int count;
	
    public Employee( float salary) {
		
		this.salary = salary;
		
		count++;
	}
	public static int getCount() {
		return count;
	} 
	
	//static 
	//{
		//System.out.println("static block called");
		//count = 50;
	//}
	
	public String toString() {
		return "Employee [salary" +" "+salary+ "]";
	}
	public static void main(String args[]) {
		 System.out.println("Main method called!!!");
		 
		 Employee e1 = new Employee( 2345.56f);
		 System.out.println(e1);
		 
		 Employee e2 = new Employee(4456.22f);
		 System.out.println(e2);
		 
		
		 
		 System.out.println("Employee count =" +Employee.getCount());
		 
}
	}
