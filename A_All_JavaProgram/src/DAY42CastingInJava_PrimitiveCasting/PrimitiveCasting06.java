package DAY42CastingInJava_PrimitiveCasting;

class Sample1
{
	double test1() 
	{
		System.out.println("running result");
		return 4;// auto widening
	}
} 
public class PrimitiveCasting06 {

	public static void main(String[] args) {
		Sample1 obj =new Sample1();
		//explicit bnarrowing
		int myInt=(int)obj.test1();
		System.out.println(myInt);
		
	}
}
