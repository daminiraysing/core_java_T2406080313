package session_04;

public class Employee {

	private int empid;
	private String empname;
	private Date dt_of_joining;
	
	public  Employee(int empid, String empname, Date dt_of_joining) {
		
		this.empid= empid;
		this.empname = empname;
		this.dt_of_joining = dt_of_joining;
		}
	
	public String toString() {
		return "Employee  [empid=" +empid+ "," + "empname=" +empname+ ", dt_of_joining=" + dt_of_joining +"]";
	}
	
	public static void main(String args[]) {
		
		Employee e = new Employee(111, "rahul", new Date(13,2,2024));
		System.out.println(e);
	}
}
