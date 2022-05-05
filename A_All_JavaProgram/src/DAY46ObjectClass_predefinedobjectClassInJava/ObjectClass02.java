package DAY46ObjectClass_predefinedobjectClassInJava;

public class ObjectClass02 {

	static int lastroll = 100;
	int rollno;
	
	//contructor
	ObjectClass02(){
		rollno = lastroll;
		lastroll++;
	}
 //@Override
	//public int hashCode() {
	// return rollno;
 //}
	//Driver code
	public static void main(String[] args) {
		//Below two statement are equivalent
		ObjectClass02 obj=new ObjectClass02();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		
	}
}
