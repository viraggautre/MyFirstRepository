package DAY44PolymorphismAndArray;

class Vehicle {
	void run() {
		System.out.println("vehicle can run");
 }
}
class Car extends Vehicle{
	void run() {
		System.out.println("car can Run");
	}
}
 public class PolymorphismOverriding02 {
	public static void main(String[] args) {
	 Car obj = new Car();
	 obj.run();
 }
}
