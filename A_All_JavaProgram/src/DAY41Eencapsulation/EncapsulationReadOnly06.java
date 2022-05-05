package DAY41Eencapsulation;

class Student1 {
	 
	private String college = "AKG";
	 
	public String getCollage() {
		return college;
	}
}

public class EncapsulationReadOnly06 {

	public static void main(String[] args) {
		 Student1 obj = new Student1();
		 System.out.println(obj.getCollage());

	}

}
