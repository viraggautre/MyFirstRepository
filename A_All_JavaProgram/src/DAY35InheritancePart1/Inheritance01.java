package DAY35InheritancePart1;

//super class/ parent class

class A1 {
	A1() {

	}

	static int a = 10;
	int b = 20;
	double c = 30.22;
}

class B1 extends A1 {
	B1() {
		super();
	}

	static int d = 40;
	int e = 50;
	double f = 60.25;
}

class C1 extends B1 {
	C1() {
		super();

	}

	static int x = 70;
	int y = 80;
	double z = 90.22;
}

public class Inheritance01 {

	public static void main(String[] args) {

		System.out.println("static member-" + A1.a);
		System.out.println("static member-" + B1.d);
		System.out.println("static member-" + C1.x);

		C1 ref1 = new C1();
		System.out.println("non-static member access by inheritance -" + ref1.b);
		System.out.println("non-static member access by inheritance -" + ref1.c);
		System.out.println("non-static member access by inheritance -" + ref1.e);
		System.out.println("non-static member access by inheritance -" + ref1.f);
		System.out.println("non-static member access by inheritance -" + ref1.y);
		System.out.println("non-static member access by inheritance -" + ref1.z);

		B1 ref2 = new B1();
		System.out.println("non-static member access by inheritance -" + ref2.b);
		System.out.println("non-static member access by inheritance -" + ref2.c);
		System.out.println("non-static member access by inheritance -" + ref2.e);
		System.out.println("non-static member access by inheritance -" + ref2.f);

	}
}