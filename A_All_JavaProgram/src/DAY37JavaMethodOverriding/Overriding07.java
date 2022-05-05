package DAY37JavaMethodOverriding;

// final method can not be overridden 

class Parent3{
	//Cant'n be overridden
	final void show() {
		
	}
}
 class Child3 extends Parent3{
	// This would produce error
	 void show() {
	 	System.out.println("I am show method of child3 class");
 	}
 }
 //Driver class
public class Overriding07 {

	public static void main(String[] args) {
		Parent3 ref1 = new Parent3();
		 ref1.show();
		 

	}

}
