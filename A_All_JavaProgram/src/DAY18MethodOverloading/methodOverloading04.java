package DAY18MethodOverloading;

class Adder {
	static int add(int a,int b) {
		return a+b;
	}

	static int add(int a, int b, int c) {
		return a+b+c;
	}
}
 
public class methodOverloading04 {
	static void disply() {
		System.out.println("I am display() of methodOverloading04");
	}
	
	public static void main(String[] args) {
		 System.out.println(Adder.add(11, 11));
		 System.out.println(Adder.add(11, 11,11));
		 disply();
		 //or
		 methodOverloading04.disply();
	}

}
