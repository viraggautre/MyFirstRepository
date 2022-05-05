package DAY45ArrayAndMultiArray;

public class Array04 {

	public static void main(String[] args) {
		 int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		 double sum =0;
		 double average ;
		// access all elements using for each loop add each element in sum
		 for(int number : numbers) {
			 sum=sum+number;
		 }
		// get the total number of elements
		int arraylength=numbers.length; 
		// calculate the average convert the average from int to double
		 average = sum/arraylength;
		 
		 System.out.println("sum:->"+ sum);
		System.out.println("average:-->"+ average);
		
	}

}
