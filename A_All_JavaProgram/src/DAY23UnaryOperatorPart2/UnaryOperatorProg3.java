package DAY23UnaryOperatorPart2;

public class UnaryOperatorProg3 {

	public static void main(String[] args) {
		int a = 0,b;
		b = a++ + ++a + ++a +a ;//8
		  //   0     2    3   3
		System.out.println("a: " + a);//3
		System.out.println("b: " + b);//8
		
		a = 5;
		b = a-- + --a + --a + a;
		//  -5     -7    -8   -8
		System.out.println(" a : " + a);//-8
		System.out.println(" b: " + b);//-28
		
		a = 21;
		b = --a + --a + --a + a + ++a + a++;
		//	20 		19	18		18	19	19
		System.out.println(b);//113
		System.out.println(a);//20
		
		a = 2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
	   	//    2   1    2     2     4      4   5
		System.out.println(a);//1
		System.out.println(b);//8
		
		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		//   -2   -1   0    0     2     2     3
		System.out.println("a: " + a);//1
		System.out.println("b: " + b);//-8
		
		
	}

}
