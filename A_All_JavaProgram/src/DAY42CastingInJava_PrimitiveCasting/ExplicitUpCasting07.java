package DAY42CastingInJava_PrimitiveCasting;
class A {
	void test1() {
		System.out.println("Running Test()");
	}
}
class B extends A{
	void test2() {
		System.out.println("Running test2()");
	}
}
class C extends B{
	void test3() {
		System.out.println("Running Test3()");
	}
}

public class ExplicitUpCasting07 {
	
	public static void main(String[] args) {
		System.out.println("Program start");
		C c1 = new C();
		B b1 = (B)c1;//explicit up-casting
		b1.test1();
		b1.test2();
		//b1.test3();
		System.out.println("Prg end");
	}
}
