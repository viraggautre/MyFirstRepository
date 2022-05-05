package DAY39InterfaceAbstract;

interface Drawable11 {
	void draw();//by default public abstract 
	default void msg() {
		System.out.println("default method");
	}
	static int cube(int x) {
		 return x*x*x;
	}
}
//default static int print() { //default static can't be written together
//System.out.println("default method method of interface");
//}

class Rectangle2 implements Drawable11 {
	public void draw() {
		System.out.println("drawing rectangle");
 }
}
public class Interface08 {
	public static void main(String[] args) {
		Rectangle2 obj = new Rectangle2();
		obj.draw();
		Drawable11 obj1 = new Rectangle2();
		obj1.msg();
		System.out.println("cube is :-> " +Drawable11.cube(5));
	}

}
