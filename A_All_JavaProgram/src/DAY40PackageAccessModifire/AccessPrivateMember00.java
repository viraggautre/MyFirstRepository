package DAY40PackageAccessModifire;
public class AccessPrivateMember00 {

	private int accNum=12345;
	
	private void displayAccNum() {
		System.out.println("Account Number:" + accNum );
	}
	
	 
	public static void main(String[] args) {
		AccessPrivateMember00 obj = new AccessPrivateMember00();
		System.out.println(obj.accNum);
		 obj.displayAccNum();
	}

}
//class AccessPrivateMembers2 {
//
//	public static void main(String[] args) {
//		
//		PrivateMembers p1=new PrivateMembers();
//		System.out.println(p1.accNum);
//		p1.displayAccNum();
//	}
//
//}
