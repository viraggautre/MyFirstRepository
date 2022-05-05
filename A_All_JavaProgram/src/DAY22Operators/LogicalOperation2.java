package DAY22Operators;

public class LogicalOperation2 {

	public static void main(String[] args) {
		// Variables Definition and Initialization

		int age = 18;
		char bloodGroup = 'O';
		boolean result1, result2;
		
		result1 = (age > 18 );
		result2 = ( bloodGroup == 'O'   );
		
		System.out.println("Result1 :- " + result1);
		System.out.println("Result2 :- " + result2);
		
		// Logical AND
		System.out.println(" blood1 && blood2 :- " + (result1 && result2));
		
		// Logical OR
		System.out.println("blood1 || blood2:-" + ( result1 || result2));
		
		// Logical Not
		System.out.println("! blood1 && blood2 :- " + !( result1 && result2));
		
	 }
}