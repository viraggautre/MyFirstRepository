package DAY35InheritancePart1;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}

class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}

class Inheritance05 extends A2,B2{

	Inheritance05() {
		super();// confusion
	}

	public static void main(String args[]) {
		Inheritance05 obj = new Inheritance05();
		obj.msg();
	}
}