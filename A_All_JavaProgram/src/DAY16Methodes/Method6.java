package DAY16Methodes;

public class Method6 {

	public static void main(String[] args) {
		/**
		 *  res=(p*r*t)/100;
		 */
		System.out.println("Get inetrest using getInterst(): "+ Method6.getInterest(250000, 6.5, 60));

	}
	public static double getInterest(int p,double r, int t) {
	double res=(p*r*t)/100;
		return res;
	 
		 

	}

}
