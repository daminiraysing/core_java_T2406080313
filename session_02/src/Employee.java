
public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee()
	{
		System.out.println("Default Constructor Called");
		empId = 111;
		empName = "Rahul";
		empSalary = 21000.67d;
	}
	
	public Employee(int i, String n, double d)
	{  
		System.out.println("Parameterized Constructor Called");
		empId = i;
		empName = n;
		empSalary = d;
		
	}
	
	public String toString() // string representation of object - object class 
	{
		return "Employee ="+ empId+" "+empName+" " +empSalary;
		
	}
	
	public static void main(String args[]) {
		Employee e = new Employee();    // for default
		System.out.println(e);
		
		Employee e1 = new Employee(222,"tina",534212.89d);
		System.out.println(e1);
	}
}
