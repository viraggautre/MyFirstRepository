package DAY44PolymorphismAndArray;

class CarCar{
	void runing() {
		System.out.println("running car");
	}
}
class nova extends CarCar{
	void runing() {
		System.out.println("running nova");
		 
	}
}
 
public class PolymorphismRunTime05 {

	public static void main(String[] args) {
		CarCar c = (CarCar)new nova();
		 c.runing();
	}

}
