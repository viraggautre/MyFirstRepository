package DAY16Methodes;

public class Method5 {

	public static void main(String[] args) {
		/**
		 *  res=(p*r*t)/100;
		 */
			System.out.println(Method5.getInterest(250000, 6.5, 60));
	}
	public static double getInterest(int p,double r, int t) {
	 return (p*r*t)/100;
		 
   }

}
 