package DAY17MethodPart2;

public class methodProgram3 {

	public static void main(String[] args) {
		 
		// result = (p*r*t)/100--principle,rate of interest and time
		// principle - is a total amount which user save in bank
		
		methodProgram3.getInterest(300000,7.5,24);
	    double result = getInterest(300000,7.5,24);
		 System.out.println("Interest is :- " + result);
		 
		              //or
		 
		 System.out.println("Interest is 2 :-" + result);
		 
		                 //  Or
		 
		 methodProgram3.getInterest2(300000,7.5,24);
		                 //or
		 methodProgram3 res = new methodProgram3();
		 res.getInterest5(250000,2.5,36);
		 
			}
	
	static double getInterest(int p, double r, int t) {

		double result = (p*r*t)/100;
		return result;
}
	              //     or 
	
	static double getInterest1(int p, double r, int t) {
		return result;
	}
	
	static void getInterest2(int p, double r, int t) {
		
		double result = (p*r*t)/100;
		System.out.println("Get Interest :- " + result);
	}
		               
	void getInterest5(int p, double r, int t) {
		 double result = (p*r*t)/100;
		 System.out.println("Result 5 :-" + result);
			
		}
	}

