package DAY45ArrayAndMultiArray;

public class Array05 {

	// creating a method which receives an array as a parameter
	static void min(int arr[]) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min number in array is:"+min);
	}
	static void max(int arr[]) {
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("max number in array is:"+max);
	}
	public static void main(String[] args) {
		int a[] = {33,13,4,52,15,1} ;// declaring and initializing an array
	 	Array05.min(a);// passing array to method
	  	Array05.max(a);// passing array to method
		
		
	}

}
