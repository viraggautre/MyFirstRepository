package DAY39InterfaceAbstract;

interface i1{
	//variable -->by default -->public static final
	//method--> by default--> public abstract
	//no complete methods/non-abstract
	//no constructor
}
//Interface declaration: by first user
interface Drawable {
	
	int salary = 25000;//by default-->public static final int salary 25000;
	void draw();//by default -->public abstract void draw();
}
//Implementation: by second user
class Rectangle1 implements Drawable {
	public void draw () {
		System.out.println("drawing Rectangle1");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
//Using interface:by third user

  class Interface01 {

	public static void main(String[] args) {
		
		Circle ref1 = new Circle();
		ref1.draw();
		Rectangle1 ref2 = new Rectangle1();
		ref2.draw();
		// In real scenario, object is provided by method e.g. getDrawable()
		Drawable d = new Circle();
		d.draw();//drawing circle
		 System.out.println("Interfaec drawable salary:->" +Drawable.salary );
	}

}
