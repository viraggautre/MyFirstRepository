package DAY36Inheritances;

class A {
	static int a = 10;
	int b = 20;
	double c = 13.45;
}

class B{
	static int x = 30;
	int y = 40;
	double z = 53.45;
	}
class C{
	static int p = 50;
	int q = 60;
	double r = 66.45;
	}
  
public class Inheritance00 {
 
	
	public static void main(String[] args) {
		System.out.println("***Access all static members***");
		 System.out.println("a=" + A.a);
		 System.out.println("x=" + B.x);
		 System.out.println("r=" + C.p);
		 
		 System.out.println("***Access all  non-static members***");
		 
		 A a = new A();
		 System.out.println("Class A non static variable=" + a.b);
		 System.out.println("Class A non static variable=" + a.c);
		 System.out.println("    ");
		 
		 B b = new B();
		 System.out.println("Class B non static variable=" + b.y);
		 System.out.println("Class B non static variable=" + b.z);
		 System.out.println("    ");
		 
		 
		 C c = new C();
		 System.out.println("Class C non static variable=" + c.q);
		 System.out.println("Class C non static variable=" + c.r);
		 
	}
	 
}
