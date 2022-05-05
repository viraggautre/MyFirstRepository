package DAY49SystemClass;

final class SamplePrint{
	static String str = "JavaBsic";
	void display(int i) {
	System.out.println("display() of samapleprint class, i:"+i);
}
}
public class SystemClassPrintlnMethod01 {

	public static void main(String[] args) {
	//final_class.static_ref_variable.public_method
		System.out.println("Hello");
		//final_class.static_ref_variable.public_method
		SamplePrint.str.length();
	}

}
