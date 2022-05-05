package DAY40PackageAccessModifire;

public class AccessPublicMember04 {
	public int age= 20;
	public void displayAge() {
		System.out.println("DisplayAge:->" + age);
	}
	 
	public static void main(String[] args) {
		 
		AccessPublicMember04 obj = new AccessPublicMember04();
		System.out.println(obj.age);
		obj.displayAge();
	}
}
  class PublicMember04{
	public static void main(String[] args) {
		System.out.println("Accessing Public Member from child class");
		AccessPublicMember04 obj = new AccessPublicMember04();
		System.out.println(obj.age);
		obj.displayAge();
	}
}