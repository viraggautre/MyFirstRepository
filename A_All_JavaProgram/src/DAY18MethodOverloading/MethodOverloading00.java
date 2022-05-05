package DAY18MethodOverloading;

public class MethodOverloading00 {

	public static void main(String[] args) {
		
		 addNumbers(); //execute honga but print nhi honga or result nhi ayenga iske liye,
		// output ke liye syso main addNumbres ko dalana padenga.
		 
		// for result
		 
		 System.out.println(addNumbers());// after this adding result will showing
		 
		 //or
		 
		 System.out.println(addNumbers(25,22));
	  	}
		static int addNumbers() {
			int num1=10, num2 = 20;
			return num1+num2;
			
		}
		static int addNumbers(int num1,int num2) {
 			return num1+num2;
	}

}
