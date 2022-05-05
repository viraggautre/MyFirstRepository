package DAY39InterfaceAbstract;
interface Printable {
	int age = 30;//by default public static final
	void print();
}
interface Showable {
	void show();
}

class Interface3 implements Printable, Showable {
	public void print() {
		System.out.println("Hello,Print");
	}
	public void show() {
		System.out.println("welcome,show");
}
}
public class Interface03 {

	public static void main(String[] args) {
		Interface3 I1 = new Interface3();
		 I1.print();
		 I1.show();
		 System.out.println("Age is :-" + Printable.age);
	}
}

