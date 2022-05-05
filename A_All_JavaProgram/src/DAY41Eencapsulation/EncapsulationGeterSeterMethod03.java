package DAY41Eencapsulation;

class Demo1{
	private int EmpID;
	private String empName;
	private int empAge;
	
	//Getter Methods
	public int getEmpID() {
		return EmpID;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	//Setter Methods
	public void setEmpID(int newValue) {
		EmpID= newValue;
	}
	 public void setEmpName(String newValue) {
		 empName=newValue;
	 }
	 public void setEmpAge(int newValue) {
		 empAge=newValue;
	 }
}
public class EncapsulationGeterSeterMethod03 {

	public static void main(String[] args) {
		 Demo1 obj = new Demo1();
		 System.out.println(obj.getEmpID());
		 System.out.println(obj.getEmpName());// string have null value
		 System.out.println(obj.getEmpAge());
		 System.out.println("************************************************");
		 
		 obj.setEmpID(123456);
		 obj.setEmpName("virag");
		 obj.setEmpAge(27);
		 System.out.println("Employ ID:->"+obj.getEmpID());
		 System.out.println("Employ ID:->"+obj.getEmpName());
		 System.out.println("Employ ID:->"+obj.getEmpID());
	}
}
