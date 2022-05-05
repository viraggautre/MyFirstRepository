package DAY43NonPrimitiveCastingOrDerivedCasting;
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune{
	void Kurla() {
		System.out.println("You are in Kurla");
	}
	
}
 
public class UpCasting02 extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}

	public static void main(String[] args) {
		UpCasting02 u1=new UpCasting02();
		
		Mumbai m1=new UpCasting02();//auto up-casting or implicit upcasting
		Mumbai m2=u1; //auto up-casting or implicit up-casting
		Pune p1=new UpCasting02();//auto up-casting or implicit up-casting
		Pune p2=u1;//auto up-casting or implicit up-casting
		
		Mumbai m3=(Mumbai)u1;//explicit up-casting
		Mumbai m4=(Mumbai) new UpCasting02();//explicit up-casting
		Pune p3=(Pune)u1;
		Pune p4=(Pune) new UpCasting02();
		 
		Pune p5=new Mumbai();//Implicit up casting
		Pune p6=(Pune)new Mumbai();//explicit up-casting
		
		  
		  
	}

}
