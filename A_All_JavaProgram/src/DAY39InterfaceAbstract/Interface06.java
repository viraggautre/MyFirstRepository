package DAY39InterfaceAbstract;

//Interface
interface Animal {
	int age = 20;//by default public static final
	public void animalSound();//interface method (does not have a body)
	public void sleep();////interface method (does not have a body)
}
//Pig "implements" the Animal interface
class Pig7 implements Animal {
	public void animalSound() {
		//The body of animalSound() is provided here
		System.out.println("The Pig says: wee wee");
	}
	public void sleep() {
		//The body of sleep() is provided here
		System.out.println("zzz");
	}
}
 public class Interface06 {

	public static void main(String[] args) {
		 Pig7 obj = new Pig7();
		 obj.animalSound();
		 obj.sleep();
		 Animal obj1 = new Pig7 ();
		 obj1.animalSound();
		 obj1.sleep();
		 System.out.println("Age is:->" + Animal.age);
	}

}
