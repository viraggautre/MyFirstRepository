package DAY13Methodoverloading;

public class MethodOverloading1 {

	public static void main(String[] args) {
		MethodOverloading1 m1=new MethodOverloading1();
		 m1.addNumbers(25,55);
		 m1.addNumbers(25,55);
		 m1.addNumbers(25,55,88);
		System.out.println( m1.addNumbers(25,55.56,88));
		m1.display();

	 
	}
	void display() {
		System.out.println("I am Pune");
	}
	int addNumbers() {
		System.out.println("********* addNumbers() started *********");
		int num1=10,num2=20;
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
	int addNumbers(int num1,int num2) {
		System.out.println("********* addNumbers() started *********");		
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
	double addNumbers(double num1,double num2) {
		System.out.println("********* addNumbers() started *********");		
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
	int addNumbers(int num1,int num2,int num3) {
		System.out.println("********* addNumbers() started *********");		
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
	double addNumbers(int num1,double num2,int num3) {
		System.out.println("********* addNumbers() started *********");		
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
}


