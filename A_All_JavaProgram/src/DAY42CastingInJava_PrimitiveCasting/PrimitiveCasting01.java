package DAY42CastingInJava_PrimitiveCasting;

public class PrimitiveCasting01 {

	public static void main(String[] args) {
	 int myInt=10;
	 double mydouble=(double)myInt;	//explicit widening
	 double dob=myInt;				// implicit widening
	 System.out.println("myInt:-"+myInt);
	 System.out.println("mydouble:->"+mydouble);
	 System.out.println("dob:->"+dob);
	 
	 
	 
	 double mydouble1=25.212121212d;
	 int v1=(int)mydouble1;		// explicit narrowing
	 float f1=(float)mydouble1;		// explicit narrowing
	 System.out.println("mydouble1:->"+mydouble1);
	 System.out.println("F1:->"+f1);
	 System.out.println("v1:->"+v1);
	}

}
//in Primitive casting does not allow implicit casting