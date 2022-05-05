package DAY36Inheritances;

//parent class
class company202{
	void display() {
		System.out.println("I am company class display 1 ");
	}
}
//child class of company
class Employee202 extends company202{
	void display() {
		System.out.println("I am employee class display()..");
		super.display();
	}
	void callme() {
		System.out.println("I am Employee class callme()..");
	}
}
 
public class Inheritance04 {

	public static void main(String[] args) {
		Employee202 ref = new Employee202();
		 ref.display();
		 ref.callme();
		 
		 company202 ref1 = new company202();
		 ref1.display();
		 
		 company202 ref2=new Employee202();
			ref2.display();
	}
}
