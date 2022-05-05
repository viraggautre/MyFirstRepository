package DAY46ObjectClass_predefinedobjectClassInJava;

public class ObjectClass03 {
 
	static int lastroll = 100;
	int rollno;
	
	// Constructor
	ObjectClass03(){
		rollno = lastroll;
		lastroll++;
	}
	@Override
	public String toString()
	{
		return "Basic Core Java";
	}
	//Driver code
	public static void main(String[] args) {
		ObjectClass03 S = new ObjectClass03();
		//Below two statement are equivalent
		System.out.println(S);
		System.out.println(S.toString());
	}

}
