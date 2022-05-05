package DAY42CastingInJava_PrimitiveCasting;

class Sample{
	void test1(double d) //double d=7;
	{
		System.out.println("d value:" + d);
	}
	void test2(int k)
	{
		System.out.println("k value:"+k);
	}
	
} 

public class PrimitiveCasting05 {

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.test1(7);
		obj.test2(52);
	}

}
