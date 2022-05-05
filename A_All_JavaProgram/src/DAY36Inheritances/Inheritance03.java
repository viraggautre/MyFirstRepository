package DAY36Inheritances;

//Parent class 
class fruitA {
	int fruitAge;
		fruitA(){
		System.out.println("fruitA class cons..");
		fruitAge = 7;
	}
		public void taste() {
			System.out.println("fruits are sweet");
		}
}
// child class of fruit
class mango extends fruitA{
	int fruitAge;
	mango(){
		//super(); java compiler will write default super ()
		System.out.println("mango class cos..");
		fruitAge =5;
	}
	public void taste() {
		System.out.println("mango are Tart in test");
	}
	public void shape() {
		System.out.println("mango is round");
	}
}
 public class Inheritance03 {

	public static void main(String[] args) {
		 mango ref = new mango();
		  ref.taste();
		  ref.shape();
		  System.out.println(ref.fruitAge);
		  System.out.println("    ");
		  
		  fruitA ref1 = new fruitA();
		  ref1.taste();
		  System.out.println(ref1.fruitAge);
	}

}
