package DAY47_48SingleTon;

  class A {
	static class ABC{
		   
			void drive() {
				System.out.println("i am  driving");}

		}
	}
 
public class Classs1 {

	public static void main(String[] args) {
		
		 A.ABC obj=new A.ABC();
		 obj.drive();
		 
	}
}
