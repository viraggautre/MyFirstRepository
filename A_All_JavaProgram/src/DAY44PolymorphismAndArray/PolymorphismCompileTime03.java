package DAY44PolymorphismAndArray;

public class PolymorphismCompileTime03 {

	static void sum(int a, int b) {
		int result=a+b;
		System.out.println("Addition of Two number:-"+result);
	}
	static void sum(int a, int b, int c) {
		int result1=a+b+c;
		System.out.println("Addition nof Three Number:-"+result1);
	}
	static void sum(double z,int x) {
		double num1=z+x;
		System.out.println("Num1 is :-"+num1);
}
	public static void main(String[] args) {
		PolymorphismCompileTime03.sum(10, 10);
		PolymorphismCompileTime03.sum(1,2,3);
		PolymorphismCompileTime03.sum(2.255,15);
	}
}
