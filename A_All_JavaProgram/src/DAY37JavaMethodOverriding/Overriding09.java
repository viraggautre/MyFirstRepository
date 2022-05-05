package DAY37JavaMethodOverriding;

 class Parent5{
	 void show() {
		 System.out.println("Parents show()");
	 }
 }
class child5 extends Parent5{
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("child show");
	}
}
class GrandChild extends child5{
	// This method overrides show() of Parent
	void show() {
		super.show();
	System.out.println("GrandChild's show()");
	}
}


public class Overriding09 {

	public static void main(String[] args) {
		 
		Parent5 ref1 = new GrandChild();
		ref1.show();
	}

}
