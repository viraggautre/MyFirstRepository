package DAY44PolymorphismAndArray;

class Bike{
	int speedlimit = 90;
}
class Honda extends Bike{
	int speedlimit = 120;
}

public class PolymorphismRunTime08 {
	public static void main(String[] args) {
		Honda b=new Honda();// create only object
	System.out.println( b.speedlimit);
	
	Bike b1=new Honda();// up casting
	System.out.println(b1.speedlimit );
	}
}
