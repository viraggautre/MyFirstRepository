package DAY45ArrayAndMultiArray;

import java.util.Arrays;

public class Array00 {
	/**
	 * datatype[] arrayName;
	 * arrayName = new datatype[size];
	 * 		//or
	 * datatype[] arrayName = new datatype[size];//////////////
	 * 		//or
	 * datatype[] arrayName={, , , , }'
	 */
	
	public static void main(String[] args) {
		 
 //datatype array name[]=new datatype [size]; 	
 	
		 
		int num[]=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		 int num1[]= {10,20,30};
		 System.out.println("array element count:->"+num1.length);
		 System.out.println("index 2 element:->"+num1[2]);
		 
		 for(int i=0; i<num1.length;i++) {
		 System.out.println(num1[i]);
	 }
		System.out.println("********************************"); 
		int num2[]=Arrays.copyOf(num1, 5);
		System.out.println("size of num2:->"+num2.length);
		 for(int i=0;i<num2.length;i++) {
			 System.out.println("element in idex:->"+i+": "+num2[i]);
		 }
		 num2[3]=40;
		 num2[4]=50;
		 System.out.println("**************************************");
		 for(int i=0;i<num2.length;i++) {
			 System.out.println(num2[i]);
		 }
		 num2[1]=505;
		 num2[2]=101;
		 
		 System.out.println("******************");
		 for(int i=0;i<num2.length;i++) {
			 System.out.println(num2[i]);
		 }
	 }
}


		
	 