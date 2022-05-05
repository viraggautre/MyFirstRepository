package DAY37JavaMethodOverriding;

// Base Class or parent class or super calss
class Parent{
	void show() {
		System.out.println("parent show ()");
	}
}
// Inheritance class or child class  or sub class
class Child extends Parent{
	//This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}
// Driver class 
 
public class Overriding05 {

	public static void main(String[] args) {
		// If a Parent type reference refers to a Parent object, then Parent's show is called 

		Parent ref1 = new Parent();
		ref1.show();
		
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent ref2 = new Child ();
		ref2.show();
	}
}
