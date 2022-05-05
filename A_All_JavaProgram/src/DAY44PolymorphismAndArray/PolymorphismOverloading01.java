package DAY44PolymorphismAndArray;

class Shapes {
	public void area() {
		System.out.println("Find area");
	}
	public void area(int r) {
		System.out.println("circle area=" + 3.14*r*r);
	}
	public void area(double b,double h) {
		System.out.println("Triangle area=" + 0.5*b*h);
	}
	public void area(int l, int b) {
		System.out.println("Rectangle area="+ l*b);
	}
}
 public class PolymorphismOverloading01 {
	public static void main(String[] args) {
	 Shapes obj = new Shapes();
	 obj.area();
	 obj.area(10);
	 obj.area(1.4d, 1.5d);
	 obj.area(10, 5);
	}
}
