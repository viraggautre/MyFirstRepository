package DAY37JavaMethodOverriding;

class Human {
	// Overridden method 
	public void eat() {
		
		System.out.println("Human is eating");
		
	}
	
}
class Boy extends Human{
	//Overriding method
	public void eat() {
		
		
		System.out.println("Boy is eating");
	}
}

 public class Overriding02 {

	public static void main(String[] args) {
		 
		Boy obj = new Boy();
		obj.eat();
		 
	}
}
