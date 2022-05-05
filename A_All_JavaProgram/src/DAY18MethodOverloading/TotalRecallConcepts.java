package DAY18MethodOverloading;

public class TotalRecallConcepts {

  static int age = 20;// static variable
  char grade = 'A';    // non-static variable
   
		//methods --->static/non-static
		//method overloading --->static/non-static
	
		public static void main(String[] args) {
			
			
			int age1 =25;
			System.out.println("Age1 :-"+age);//local variable
			
			System.out.println(age);//static variable output will print
			
			TotalRecallConcepts ref= new TotalRecallConcepts();
		 			System.out.println(ref.grade );// for non-static need to create object
		 			
		 		System.out.println(TotalRecallConcepts.addNumber(22,25));//static -access through class name with method name
		 		
		 		TotalRecallConcepts V1=new TotalRecallConcepts();
		 	    V1.addnumber(25,55);//  non static variable object created in method concept
		}	 
			 static double addNumber(int num1, double num2) {  
				 double res =num1+num2;
					return res;	 
						 
		}
			 int addnumber(int num1,int num2) {
			 int result = num1 +num2;
			return result;
			
			
	}
			 
}