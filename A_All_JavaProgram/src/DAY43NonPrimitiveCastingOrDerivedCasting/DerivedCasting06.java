package DAY43NonPrimitiveCastingOrDerivedCasting;

class Member {
	// member variable of this class
	long phone;
	//member function of this class
	void chat() {
		//print message of member/child class	
		System.out.println("chatting in whatsapp group with "+ phone);
 }
}
class Admin extends Member{
	// member function of this class
	void addNumber() {
		//print message of this admin/parent class
		System.out.println("adding a new user number in whatsapp group");
	}
}
public class DerivedCasting06 {
		//main driver method
	public static void main(String[] args) {
		 // creating an object Ad
		Member mem = new Admin();
		mem.phone = 8668788608l;
		// Calling Function 
		mem.chat();
		System.out.println("***************After downcasting*********");
		Admin ad = (Admin) mem;// Downcast to access specific property of subclass
		ad.addNumber();
		ad.chat();
		System.out.println(ad.phone);
		//Admin a1=new Mwmbwer();//direct downcasting, invalid or not possible
	}
}
/**
* child class object referred by any of its parent known as up casting


* parent class object referred by any of its child class known as downcasting
  directly down casting is not possible in java

Child c2=new Parent();//down casting but not possible in this way

Parent p1=new Child();

Child c1=(Child)p1;//downcasting, as Upcasting object is getting down casted here
 */