package DAY44PolymorphismAndArray;
class Animal{
	void eat() {
		System.out.println("Animal Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("herbivores eat Plant");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("omnivores eat plant and meat");
	}
}
class carnivores extends Animal{
	void eat() {
		System.out.println("carnivores eat meat");
	}
}
public class PolymorphismRunTime06 {
	public static void main(String[] args) {
	 Animal A = new Animal  ();//creat object
	 A.eat();
	 
	 Animal A1=(Animal)new herbivores();// up casting 
	 A1.eat();
	 
	 Animal A2=(Animal)new omnivores();// up casting 
	 A2.eat();
	 
	 Animal A3=(Animal)new carnivores ();// up casting 
	 A3.eat();
	}

}
