package DAY44PolymorphismAndArray;
class Hillstations{
	void location() {
		System.out.println("Location is Pune");
	}
	void famousfor() {
		System.out.println("Famous for wondering");
	}
}
class Manali extends Hillstations{
	void location() {
		System.out.println("manali is in himachal pradesh");
	}
	void famousfor() {
		System.out.println("it is famous for hadimba temple ");
	}
}
class Mussoorie extends Hillstations{
	void location() {
		System.out.println("Mussoorie is in Uttarakhand");
	}
	void famousfor() {
		System.out.println("It is Famous for education institutions");
}
}
	class Gulmarg extends Hillstations {
		void location() {
			System.out.println("Gulmarg is in J&amp;K");
		}
		void famousfor() {
			System.out.println("It is Famous for skiing");
		}
	}
 
public class PolymorphismRunTime07 {
	public static void main(String[] args) {
		Hillstations h=new Hillstations();
		h.location();
		h.famousfor();
		
		Hillstations h1=(Hillstations)new Manali();
		h1.location();
		h1.famousfor();
		
		Hillstations h2=new Mussoorie();
		h2.location();
		h2.famousfor();
		
		Hillstations h3=new Gulmarg() ;
		h3.location();
		h3.famousfor();
	}

}
