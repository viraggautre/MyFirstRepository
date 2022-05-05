package DAY43NonPrimitiveCastingOrDerivedCasting;

class A{
	void test1() {
		System.out.println("Running test1()");
	}
}
class B extends A{
	void test2() {
		System.out.println("Running test2()");
	}
}
class C extends B{
	void test3() {
		System.out.println("Running tes3()");
	}
}
 public class ExplicitUpCasting04 {
	public static void main(String[] args) {
		System.out.println("*********Program start***************");
		C c1 =new C();
		 B b1=(B)new C();//explicit up-casting
		 B b2=(B)c1;//explicit up-casting....
		 
		 b2.test1();
		 b2.test2();
		 
		 
	}

}
