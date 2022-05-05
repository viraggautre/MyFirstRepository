package DAY46ObjectClass_predefinedobjectClassInJava;
class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class Objectclass00 extends Demo{

 	static int last_roll = 100;
	 int roll_no;

	// Constructor
 	Objectclass00()
    {
        roll_no = last_roll;
         last_roll++;
    }

	// Driver code
	public static void main(String args[]) {
		Objectclass00 s = new Objectclass00();

		// Below two statements are equivalent
		System.out.println(s);//s.toString() -->string representation of an object
		System.out.println(s.toString());//string representation of an object
		System.out.println(s.hashCode());
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());		
		Demo d2=new Objectclass00();
		System.out.println(d2);
	}

} 