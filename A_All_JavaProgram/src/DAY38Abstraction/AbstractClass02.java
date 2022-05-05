package DAY38Abstraction;

abstract class Bike1 {
	abstract void run();
	void speed (int spd) {
		System.out.println("Bike speed :" + spd);
	}
}
class Honda4 extends Bike1{
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda speed :" + spd);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda color is blue");
	}
}
 
public class AbstractClass02 {
	public static void main(String[] args) {
	 Honda4 ref1 = new Honda4();
	 ref1.run();
	 ref1.speed(60);
	 ref1.color();
	 
	//  Bike1 b1 = new Bike1();// cant creatw object when abstract class is form 
	 Bike1 b2 =new  Honda4();
	 b2.speed(12);
	 b2.run();
	 
	}

}
