package DAY35InheritancePart1;

class A {
	static int a = 10;
	int b = 20;
	double c = 13.45;
}

class B {
	static int x = 30;
	int y = 40;
	double z = 53.45;
}

class C {
	static int p = 50;
	int q = 60;
	double r = 66.45;
}

public class Inheritance00 {

	public static void main(String[] args) {
		// access static member class A, class B, Class C
		System.out.println("static int a :- " + A.a);
		System.out.println("static int x :- " + B.x);
		System.out.println("static int p :- " + C.p);

		// access non-static member class A, class B, Class C
		// class A:-
		A ref1 = new A();
		System.out.println("Non static:= " + ref1.b);
		System.out.println("Non static:= " + ref1.c);

		// class B:-
		B ref2 = new B();
		System.out.println("Non static:= " + ref2.y);
		System.out.println("Non static:= " + ref2.z);

		// class C:-
		C ref3 = new C();
		System.out.println("Non static:= " + ref3.q);
		System.out.println("Non static:= " + ref3.r);

	}
}
/**
 * inheritance: when a child class inherit then property of it parent class know
 * as inheritance. Representation: class childclassname extends parentclassname{
 * } Inheritance is achieved by using super() statement. -->used to call
 * parent/super class constructor based on parameter. -->super() should be the
 * first statement inside the constructor body. Note:- In inheritance only
 * non-static member involves super() and this() cant be together.
 * 
 * 
 */