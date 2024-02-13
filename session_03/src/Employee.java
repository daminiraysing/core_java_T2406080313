
public class Employee{
     private int empid;
     private String empname;
     private float empsal;
     private static int count; // static member 
     
     public Employee() {}    // default constructor

     
     public Employee(int empid, String empname, float empsal){
    	 
    	 this.empid= empid;
    	 this.empname = empname;
    	 this.empsal = empsal;
    	 count++;
     }
     
     public static int getCount()  // static block it allow only static members 
     {
    	 return count;
     }
     
     public String toString() {
    	 return "Employee [empid=" + empid+ "," + "empname=" + empname+ "," +"empsal=" +empsal+ "]";
     } 
    	 static
    	 {
    		System.out.println("Static block called!!!");
    		count = 60;
    	 }
    	 
    	 public static void main(String args[]) {
    		 System.out.println("Main method called!!!");
    		 
    		 Employee e1 = new Employee(111, "riya", 2345.56f);
    		 System.out.println(e1);
    		 
    		 Employee e2 = new Employee(222, "neel", 4456.22f);
    		 System.out.println(e2);
    		 
    		 Employee e3 = new Employee(333, "kashaf", 5434.33f);
    		 System.out.println(e3);
    		 
    		 System.out.println("Employee count =" +Employee.getCount());
    		 
    		// System.out.println("Employee count =" +e1.getCount());
    		// System.out.println("Employee count =" +e2.getCount());
    		 //System.out.println("Employee count =" +e3.getCount());
    		 
    	 } 		 
} 
    	 


