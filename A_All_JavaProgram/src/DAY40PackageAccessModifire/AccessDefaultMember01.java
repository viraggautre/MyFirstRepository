package DAY40PackageAccessModifire;

public class AccessDefaultMember01 {

	  int accNum=1245;
	  void displayAccNum() {
		  System.out.println("Account Number:-> " + accNum);
	  }
	public static void main(String[] args) {
		AccessDefaultMember01 Dj = new AccessDefaultMember01();
		System.out.println(Dj.accNum);
		Dj.displayAccNum();
 }
}
class AccessDefaultmember{
	public static void main(String[] args) {
		AccessDefaultMember01 Dj = new AccessDefaultMember01();
		System.out.println("Accessing default member from child class ");
		System.out.println(Dj.accNum);
		Dj.displayAccNum();
	}
}
 
