package DAY49SystemClass;

final class SamplePrint1{
	void display(int i) {
		System.out.println("display() of samaplePrint class, i" +i);
	}
}
 
public class PrintMethod03 {
	static SamplePrint s1=new SamplePrint();
	public static void main(String[] args) {
//final_class.static_ref_variable.public_method
		System.out.println("Hello");
//final_class.static_ref_variable.public_method
		PrintMethod03.s1.display(10);
	}

}
