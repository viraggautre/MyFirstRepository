package DAY38Abstraction;

//Abstract Class 
abstract class Animal{
	
	public abstract void animalSound();
	//Abstarct method(does not have a body)
	
	//Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}
// Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here	
		System.out.println("The pig says: wee wee");
	}
}
   // Subclass (inherit from Animal)
class Dog8 extends Animal {
	public void animalSound() {
		// The body of animalsound provided here
		System.out.println("The dog says: bow bow");
	}
}
public class AbstractClass00 {

	public static void main(String[] args) {
		Pig ref1 = new Pig(); // create a pig object
		ref1.animalSound();
		ref1.sleep();
		
		Dog8 ref2 = new Dog8();
		ref2.animalSound();
		ref2.sleep();
		
		
	}
}
