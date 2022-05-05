package DAY38Abstraction;
abstract class RBIBank102{
	final abstract double  getRateOfInterestForHomeLoan();
	//abstract mean must be overridden
	//final mean can't be overridden 
}

class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	
	}
}
 
public class AbstractionClass05 {

	public static void main(String[] args) {
		
		
	}
 }
