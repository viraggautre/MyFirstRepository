package DAY45ArrayAndMultiArray;

class TestReturnArray{
	// creating method which returns an array	
	static int[] getArray() {
		return new int[] {10,20,30,40,50,60};
	}
	static int getNum() {
		int num = 10+20;
		return num;
}
}
public class Array06 {
	public static void main(String[] args) {
		// calling method which returns an array 
		int arr[] = TestReturnArray.getArray ();
		// printing the values of an array
 for(int i=0;i<arr.length;i++) {
	 System.out.println(arr[i]);
 }
 	}
}
