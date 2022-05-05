package DAY41Eencapsulation;

class Demo{
	private int empID = 12345;
	private double salary= 50000;
	//getter methods
	public int getEmpID() {
		return empID;
	}
	public double getSalary() {
		return salary;
	}
	//setter methods
	public void setEmpID(int id) {
		empID=id;
	}
	public void setSalary(double sal) {
		salary=sal;
	}
}
 
public class EncapsulationGeterSeterMethod01 {

	public static void main(String[] args) {
	 Demo obj = new Demo();
	// System.out.println(obj.empID);//compile time error
	// System.out.println(obj.salary);//compile time error
	  System.out.println("empID is :-> " +obj.getEmpID() );
 	 System.out.println("salary is :-> " +obj.getSalary());
	 
	 double updateSalary=obj.getSalary()+14000;
	 int updateempID=obj.getEmpID()+9395;
	 System.out.println("Update Salary:" + updateSalary);
	 System.out.println("Updated EMPID:-> " + updateempID );
	 System.out.println( "*********************************" );
	 
	 obj.setEmpID(1425);
	 obj.setSalary(55555);
 	 System.out.println(obj.getEmpID());
	 System.out.println(obj.getSalary());
	}
}
/**
 * In order to access private variable outside the class we need implement getter method
 * 		--> getter method--> helps to access private variable from outside the class
 * 				--> declared with public 
 * 				--> return type of this method should be same as private variable
 * 				--> it should return private variable
 * In order to modify private variable outside the class we need implement setter method
 * 		--> setter method--> helps to modify private variable from outside the class
 * 				--> declared with public 
 * 				--> return type of this method is void but parameter should be same as private variable
 * 
 * 
 */
