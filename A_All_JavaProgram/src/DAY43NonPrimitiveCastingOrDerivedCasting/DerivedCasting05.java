package DAY43NonPrimitiveCastingOrDerivedCasting;
class Parent1{
	//Function
	void show() {
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child1 extends Parent1 {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class DerivedCasting05 {
	// Main driver method
	public static void main(String[] args) {
	 //object of child class and reference of child class
		Child1 c1=new Child1();
		c1.readme();
		c1.callme();
		c1.show();
		System.out.println(" ");
		
		//Object of Parent class and reference of Parent class
		Parent1 p1=new Parent1();
		p1.show();
		p1.callme();
		//p1.read-me();//parent cannot inherit the child class object
		
		System.out.println(" ");
		Child1 ch = new Child1();
		ch.readme();
		ch.callme();
		ch.show();
		
	//	Parent1 obj =(Parent1) ch();//explicit up-casting
		//or
		Parent1 obj1=(Parent1)new Child1();//explicit up-casting
		obj1.show();
		obj1.callme();
		
	}

}
