package DAY47_48SingleTon;

class Sampleton{
	/**
	 * 1.constructor should be private
	 * 2.create static reference variable of the class
	 * 3.create static method which return current class object
	 */
	
	//1.constructor should be private
	private Sampleton() {
		System.out.println("Sampleton class cons");
	
	}
	//2.create static reference  variable of the class
	static Sampleton singleObj = new Sampleton();
	
	//3.create static method which returns current class object	
	
	public static Sampleton getSampletonObject() {
		return singleObj;
	}
	void display() {
		System.out.println("I am display()");
	}
		}
 
public class SingleTon00 {

	public static void main(String[] args) {
	
	//	Sampleton s1 = new Sampleton();//error as Sampleton is a signleton class
		
	// Sampleton.getSampletonObject().display();//or
	 Sampleton s2=Sampleton.getSampletonObject();
		s2.display();
		
	}

}
