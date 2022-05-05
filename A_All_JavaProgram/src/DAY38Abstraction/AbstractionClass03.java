package DAY38Abstraction;

abstract class shape {
	abstract void draw();
}
//In real scenario, implementation is provided by others i.e.
//unknown by end user
class Rectangle extends shape{
	protected void draw() {
		System.out.println("Drwaing Rectangle");
	}
}
class Circle1 extends shape{
	public void draw() {
		System.out.println("drawing circle");
	}
}

//In real scenario, method is called by programmer or user
public class AbstractionClass03 {

	public static void main(String[] args) {
	 shape ref1 = new Circle1();
		ref1.draw();
		shape ref2 = new Rectangle();
		ref2.draw();
		
	}

}
