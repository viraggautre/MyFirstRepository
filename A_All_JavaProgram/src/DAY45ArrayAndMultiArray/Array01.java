package DAY45ArrayAndMultiArray;

public class Array01 {

	public static void main(String[] args) {
		 
		int num[]=new int[5];
		 System.out.println(num[0]);
		 System.out.println(num[1]);
		 System.out.println(num[2]);
		 System.out.println(num[3]);
		 System.out.println(num[4]);
		 
		 num[0]=10;
		 num[1]=20;
		 num[2]=30;
		 num[3]=40;
		 num[4]=50;
		 
		 System.out.println(num[0]);
		 System.out.println(num[1]);
		 System.out.println(num[2]);
		 System.out.println(num[3]);
		 System.out.println(num[4]); 
		 
		 System.out.println("Array element--> "+num.length);
		 for(int i=0;i<num.length;i++) {
			 System.out.println(num[i]);
	        }
		 System.out.println("**************for-each loop*************");
			/**
			 * LHS should be same as RHS type in form of datatype or class
			 * for(LHS : RHS){
			 * 
			 * }
			 */
		 for(int a: num ) {
			 System.out.println(a);
		 }
		  char[] getArray =new char[] { 'A','B','C','D' };
			//or
		// int[] getArray2 ={ 10, 30, 50, 90, 60 };
		 System.out.println("**************for-each loop----5*************");
		 for(char bip: getArray) {
	System.out.println(getArray);
	}
	}
}
