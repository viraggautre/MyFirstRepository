package DAY38Abstraction;

abstract class RBIBank {
	 abstract double getRateOfInterestForHomeLoan();
	 final void loan() {
		 System.out.println("As per RBI Loan..");
	 }
 }
class SBI101 extends RBIBank {
	 double getRateOfInterestForHomeLoan() {
		 return 6.45;
	 }
}
class PNB extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		 return 7.5;
}
 }
class AbstractionClass04{
	public static void main(String args[]) {	
		PNB ref1 = new PNB();
		 System.out.println("PNB Rate of Interest is: " + ref1.getRateOfInterestForHomeLoan() + " %");
	    ref1.loan();
    	SBI101 s1 =new  SBI101();
	  	System.out.println("SBI Rate of Interest is: " + s1.getRateOfInterestForHomeLoan() + " %");
	 	s1.loan();
	 	RBIBank b1 = new SBI101();
		System.out.println("RBI reference but object of SBI, Rate of Interest is: " + b1.getRateOfInterestForHomeLoan() + " %");
		RBIBank b2 = new PNB();
		System.out.println("RBI reference but object of PNB, Rate of Interest is: " + b2.getRateOfInterestForHomeLoan() + " %");	
	 	 
	}
}