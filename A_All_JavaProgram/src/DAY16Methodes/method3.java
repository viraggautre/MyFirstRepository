package DAY16Methodes;

public class method3 {

	public static void main(String[] args) {
		 		
		printDetails(30, 96000);
		printDetails(25, 56000);
		printDetails(26, 45000);
		 
	}
	/**
	 * access modifier: public
	 * non-access modifiers: static
	 * returntype: void
	 * methodname: printDetails
	 * @param age
	 * @param salary
	 */
 
	public static void printDetails(int age, int salary) {
		
	       System.out.println("Hi, Good morning Everyone");
	       System.out.println("Staying in Pune");
	       System.out.println("I am " +age+ "yer old");
	      System.out.println("I am getting " +salary);
	    //return;//optional because if you don't write it then java compiler will write it
	}
	      
	      
	    	  
	 
}
 