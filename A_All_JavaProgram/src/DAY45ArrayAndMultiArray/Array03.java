package DAY45ArrayAndMultiArray;

public class Array03 {

	public static void main(String[] args) {
		 
//	 String[] cars;
//	 cars=new String[4];
	 
 //		cars[0]="volvo";
//	 cars[0]="BMW"; 
// 		cars[0]="Ford";
// 		cars[0]="Mazda";	 
			 
	 //OR
	 
	 String[] cars= {"volvo","BMW","Ford","Mazda"};
	 // Access the element of an Array
	 System.out.println(cars[0]);//volvo
	 
	 //change an Array Element
	 cars[0] = "Opel";
	 System.out.println(cars[0]);//opel
	 
	 //Array element count
	 System.out.println(cars.length);
	 
	  System.out.println("*******Normal For-Loop*********************");
	 //iterate array element using for loop
	  for(int i=0;i<cars.length;i++) {
		  System.out.println(cars[i]);
		 }
	  System.out.println("*****for each loop***********");
	 
	  //iterate array element using for each loop
		for(String A : cars) {
			System.out.println(A);
		}
}
}