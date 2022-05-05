package DAY11FinalVariable;

public class FinalVariable4 {
	/* as pi is  a global variable */
	
	static double pi;
	
		public static void main(String[] args) {
		//area=pi*r*r;
			int r=25;
			pi = 3.14;
		System.out.println(" Radius is : " + r);
		double area = pi*r*r;
		System.out.println("Aria of circle is :" + area);

	}

}
/*
final: is keyword
	: constant or fixed
	: once its value is initiliazed that value can not be changed
	: final variable needs to be initiliaze at the time of declaration
*/