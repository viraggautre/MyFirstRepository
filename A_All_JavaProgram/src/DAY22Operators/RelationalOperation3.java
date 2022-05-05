package DAY22Operators;

public class RelationalOperation3 {

	public static void main(String[] args) {
		// Variables Definition and Initialization
		
		int num1 = 19;
		int num2 = 14;
		System.out.println( "num1: " + num1 + "--->num2: " + num2 );//19  14
		
			//or
		
		// is equal to	
		boolean res = (num1 == num2);
		System.out.println("num1==num2:- " + (res));
		
		//is not equal to
		res =  num1 != num2 ;
		System.out.println("num1 != num2:- " + res);
		
		// Greater than 
		res = num1 > num2;
		System.out.println("num1 > num2:- " + res);
		
		// Less Than
		res = num1 < num2;
		System.out.println("num1 < num2:- " + res);
		
		// Greater than or equal to
		res = num1 >= num2 ;
		System.out.println("num1 >= num2:-" + res);
		
		//less than or equal to
		res = num1 <= num2;
	    System.out.println("num1 <= num2:- " + res );
		
		
	}

}
