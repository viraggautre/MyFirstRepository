package DAY43NonPrimitiveCastingOrDerivedCasting;
class A2{
	void test1() {
		System.out.println("Running test()");
	}
}
class B2 extends A2{
	void test2() {
		System.out.println("Running test1()");
	}
}
class C2 extends B2{
	void test3() {
		System.out.println("Running test2()");
	}
}
public class AutoUpCasting03 {
	public static void main(String[] args) {
	 System.out.println("*****Program start*********");
	// 	C2 c2 = new C2();
	// 	c2.test1();
	// 	c2.test2();
	 //	B2 b2=new B2();
	 //	b2.test1();
	 //	b2.test2();
	// 	A2 a2=new A2();
	 //	a2.test1();
	 	
	 	B2 obj=new C2();//auto up-casting
	 	obj.test1();
	 	obj.test2();
	 	
	 	C2 obj1=new C2();
	 	B2 obj2=obj;//implicit up casting
	 	B2 obj3=(B2)obj1;//explicit up casting---->B2 b2=(B2)new C2();
	 		//or
	// B2 b3=(B2)new C2();//explicit up casting-
	 	//		b2.test1();
	 	//		b2.test2();
	 			
	 			
	 			A2 a1=new C2();//implicit/auto upcasting
	 			A2 a2=new B2();//implicit/auto upcasting
	 			
	 			B2 x1=new B2();
	 			A2 a3=x1;//implicit/auto upcasting
	 			A2 a4=(A2)x1;//explicit upcasting
	 			A2 a5=(A2)new B2();
	 			System.out.println("Program ends");
	}
}
