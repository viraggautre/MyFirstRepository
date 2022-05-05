package DAY46ObjectClass_predefinedobjectClassInJava;

public class ObjectClass01 extends Demo {
	
	static int lastroll = 100;
	int rollno;
	
	//Constructor
	ObjectClass01(){
		rollno=lastroll;
		lastroll++;
	}
     //Driver code
	public static void main(String[] args) {
		ObjectClass01 obj = new ObjectClass01();
			// below two statement are equivalent
		System.out.println(obj);//obj.toString==>string representation of an object
		System.out.println(obj.toString());//string representation of an object
		System.out.println(obj.hashCode());
		Demo d1 = new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
	}

}
