package DAY11FinalVariable;

public class FinalVariable2 {

	public static void main(String[] args) {
		 //area=pi*r*r;
		int r=21;
		final double pi;// as pi is a local variable hence its value can be initialize before use as well
		System.out.println("Radious : " + r);
		pi= 3.14;	
	  double area = pi*r*r;
		System.out.println("Area of circle : " + area);
	}

}
 
/*
final: is keyword
	: constant or fixed
	: once its value is initialize that value can not be changed
	: final variable needs to be initialize at the time of declaration
*/