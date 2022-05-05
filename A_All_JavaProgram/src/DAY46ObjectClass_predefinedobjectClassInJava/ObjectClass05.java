package DAY46ObjectClass_predefinedobjectClassInJava;
class Print{
	int a=10;
	public int hashCode() {
		return 101;
	}
	public String toString() {
		return "I am Print Class toString";
	}
	public boolean equals(Object obj) {
		Print p=(Print)obj;//new Print();
		return (this.a==p.a);
		//10==10
	}
}
 public class ObjectClass05 {

	static int lastroll=100;
	int rollno;
	ObjectClass05()
	{
		rollno=lastroll;
		lastroll++;
	}
	public static void main(String[] args) {
		  
		ObjectClass05 S1 =new ObjectClass05();
		System.out.println(S1);
		System.out.println(S1.hashCode());
		
		ObjectClass05 s2 = new ObjectClass05();
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s2.equals(S1));//false
		
		Print p1 =new Print();
		System.out.println(p1);
		System.out.println(p1.hashCode());
		Print p2 =new Print();
		System.out.println(p1.equals(p2));
			}
}
