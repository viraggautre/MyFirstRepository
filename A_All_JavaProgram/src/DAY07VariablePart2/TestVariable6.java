package DAY07VariablePart2;

public class TestVariable6 {

	public static void main(String[] args) {
		 //22/7*10*10===>3.14*10*10

		int r=10;
		double result;
		result=(22/7)*r*r;
		System.out.println("Result1 :" + result);
		result=3.14*r*r;
		System.out.println("Result2: "+result);
		
		
		double res2=65/4;//===>16.0
		System.out.println("Result3: "+res2);
		res2=65/4.0f;//===>16.25
		System.out.println("Result4: "+res2);
		
	}
	
}
