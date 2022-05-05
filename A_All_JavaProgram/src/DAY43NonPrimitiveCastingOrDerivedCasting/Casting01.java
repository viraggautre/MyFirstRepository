package DAY43NonPrimitiveCastingOrDerivedCasting;

class Parent{
	void myHome(){
		System.out.println("Parent Home");
	}
}
class Child extends Parent{
	void myCar() {
		System.out.println("Child Car");
	}
}
public class Casting01 {

	public static void main(String[] args) {
		 Child c1 =new Child();
		 c1.myCar();
		 c1.myHome();
		Parent P1=new Parent();
		P1.myHome();
		 System.out.println("**********Using Upcasting***************************");
		 //using casting concept
		 Child c2=new Child();
		 c2.myCar();
		 c2.myHome();
	//	Parent p5=c2;//Implicit auto upcasting
		// p5.myHome();
		 Parent p5=(Parent)new Child();//explicit upcasting
	}

}
