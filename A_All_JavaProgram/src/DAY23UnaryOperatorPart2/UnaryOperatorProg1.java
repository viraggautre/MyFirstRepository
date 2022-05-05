package DAY23UnaryOperatorPart2;

public class UnaryOperatorProg1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		System.out.println("a:- " + a);
		System.out.println("b:- " + b);

		/**
		 * pre : first perform the operation then use the value
		 * post : first use  the value then perform the operation
		 * 
		 */
		
		 int k = ++a;
		 System.out.println("K: " + k);//11
		 System.out.println("a : " + a);//11
		 
		 int j = k++;
		 System.out.println("J: " + k);//11
		 System.out.println("j: " + j);//12
		 
		 int r = 21;
		 System.out.println("r: " + r++);//21
		 System.out.println("r: " + r);//22
		 System.out.println("r: " + ++r);//23
		 System.out.println("r: " + r);//23
		 
		 int x = 105;
		 System.out.println("x : " + --x);//104
		 System.out.println("x: " + x);//104
		 System.out.println("x : " + x--);//104
		 System.out.println("x : " + x);//103
		 
	}
}
