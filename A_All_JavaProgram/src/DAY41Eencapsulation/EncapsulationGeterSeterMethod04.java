package DAY41Eencapsulation;

class Student {
	//private data member
	private String name;
	//getter methods for name
	public String getName() {
		return name;
	}
	// setter methods for name
	public void setEmpName(String name) {
		this.name=name;
	}
}
 public class EncapsulationGeterSeterMethod04 {

	public static void main(String[] args) {
		 Student obj =new Student();
		 System.out.println(obj.getName());
		 obj.setEmpName("virag");
		 System.out.println(obj.getName());
	}

}
//EncapsulationGeterSeterMethod07