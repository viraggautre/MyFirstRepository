package DAY37JavaMethodOverriding;

	class Animal2{
		public void move() {
			System.out.println("Animals can move");
		}
	}
	class Dog2 extends Animal2 {
		public void move() {
			super.move();
			System.out.println("Dogs can walk and run");
			 
		}
	}

 
public class Overriding03 {

	public static void main(String[] args) {
		Animal2 ref = new Dog2();
		 ref.move();

	}

}
