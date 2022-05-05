package DAY23UnaryOperatorPart2;

public class UnaryOperatorProg2 {

	public static void main(String[] args) {
	 
			int a = 47;
			int b = a;
			b = a++;
			System.out.println(a);//48
			System.out.println(b);//47
			
			int x = a;
			int y;
			
			System.out.println(x);//48
			y = ++x;
			System.out.println("x: " + x);//49
			System.out.println("y : " + y);//49
			
			int p = -15, q = 25, res;
			res = p++ + --q ;
			System.out.println("res: " + res);//9
			System.out.println("p: " + p);// -14--> + * - is equal to = -
			System.out.println("q: " + q);//24
			
			int res1 = ++p + ++q;
			System.out.println("res1: " + res1);//12
			System.out.println("p: " + p);// -13
			System.out.println("q: " + q);//25
			
			 
			  
	}

}
