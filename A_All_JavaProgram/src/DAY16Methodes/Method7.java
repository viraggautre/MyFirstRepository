package DAY16Methodes;

public class Method7 {

	public static void main(String[] args) {
		/**
		 *  res=(p*r*t)/100;
		 */
		 Method7.getInterest(350000, 5 ,36);

	}
public static void getInterest(int p, double r, int t) {
double res=(p*r*t)/100;
System.out.println("Interest is " +res);
}
}