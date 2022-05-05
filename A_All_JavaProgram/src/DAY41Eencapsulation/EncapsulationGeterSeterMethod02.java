package DAY41Eencapsulation;

class Person {
	private String name;// private=restricted access
	//Getter Methods
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name=newName;
	}
}

 
public class EncapsulationGeterSeterMethod02 {
	
public static void main(String[] args) {
	
	Person obj = new Person();
	System.out.println(obj.getName());
	
	obj.setName("Virag");// Set the value of the name variable to "virag"
	System.out.println(obj.getName());
}
}