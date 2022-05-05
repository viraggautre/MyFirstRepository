package DAY39InterfaceAbstract;

interface Animal00 {
	int age = 50;//by default public static final
	public void animalSound();//interface method (does not have a body)
	public void sleep();// interface method (does not have a body)
}
//Interface
interface Reptile {
	public void color ();//interface method (does not have a body)
}
// Pig "implements" the Animal interface
class Pig implements Animal00 {
	public void animalSound() {
	// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
	//  The body of sleep() is provided her
		System.out.println("zzZz");
	}
}
class Dog extends Pig implements Reptile {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bhoou bhou");
	}
	public void color() {
		System.out.println("color is black");
	}
	public void sleep() {
		System.out.println("At night");
	}
}
public class Interface07 {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.animalSound();
		obj.color();
		obj.sleep();
		
		Pig obj1 = new Pig();
		obj1.animalSound();
		obj1.sleep();
		
		System.out.println("age is :->" + Animal00.age);
	}
}
