package DAY39InterfaceAbstract;

interface Bank{
	float rateofinterest();//by default-->public abstract
}
class SBI1 implements Bank {
	public float rateofinterest() {
		return 9.15f;
 }
}
class PNB1 implements Bank {
	public float rateofinterest() {
		return 9.7f;
 }
}
 
public class Interface02 {

	public static void main(String[] args) {
		 PNB1 P1 = new PNB1();
		System.out.println("PNB1 ROI:->" + P1.rateofinterest());
		SBI1 S1 = new SBI1();
		System.out.println("SBI1 ROI:-->" + S1.rateofinterest());
		
		Bank B1 = new PNB1();
		System.out.println(B1.rateofinterest());
	}

}
