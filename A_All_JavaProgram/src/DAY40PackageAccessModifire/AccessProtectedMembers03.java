package DAY40PackageAccessModifire;

public class AccessProtectedMembers03 {
protected int age=20;
protected void displayage() {
	System.out.println("Dispaly Age:->" + age);
}
	public static void main(String[] args) {
	 
		AccessProtectedMembers03 obj = new AccessProtectedMembers03();
		System.out.println(obj.age);
		obj.displayage();
	}

}
  class AccessProtectedMembers00 {
	
	public static void main(String[] args) {
		System.out.println("Accessing Protected member from child class ");
		AccessProtectedMembers03 obj = new AccessProtectedMembers03();
		System.out.println(obj.age);
		obj.displayage();
	}
}