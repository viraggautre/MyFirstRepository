package DAY45ArrayAndMultiArray;

public class Array07 {

	public static void main(String[] args) {
		 //creating an array
		int[] age= {12, 15, 18, 22, 27};
		
		//access each array elements
		System.out.println("accessing each elementsvof array");
		System.out.println(" 1st ele:-->"+age[0]);
		System.out.println("2nd ele:-->"+age[1] );
		System.out.println("3rd ele:-->"+age[2] );
		System.out.println("4th ele:-->"+age[3] );
		System.out.println("5th ele:-->"+age[4] );
		System.out.println("length of the array:-->"+age.length);
		
		System.out.println("***************Using for Loop:");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
	
	System.out.println("************Using for-each Loop:");
	for(int AGE : age) {
		System.out.println(AGE);
//		if(a==25){
//		System.out.println(a);
//		break;
//		}else {
//			System.out.println("age is not 25");
	}
}
}
