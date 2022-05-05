package DAY44PolymorphismAndArray;

class Bank{
	float getRateOfInterest() {
		return 1.5f;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 2.5f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 3.5f;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 4.5f;
 }
}
public class PolymorphismRunTime04 {
	public static void main(String[] args) {
		 Bank obj = (Bank)new AXIS();//explicit up casting
		 System.out.println("AXIS  RateOfInterest is :-"+obj.getRateOfInterest());
		 Bank obj1=(Bank)new ICICI();
		 System.out.println("getRateOfInterest:->" + obj1.getRateOfInterest());
		 obj=new SBI();//up casting
		 System.out.println("getRateOfInterest:->"+ obj.getRateOfInterest());
		 Bank Ba=new Bank();
		System.out.println(Ba.getRateOfInterest());
	}
}
