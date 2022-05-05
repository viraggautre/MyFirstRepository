package DAY24conditionalStatementFOR_IF_loops;

public class EvenNumberBetween1to100 {

	public static void main(String[] args) {
	  
		int number = 100;
		System.out.println("List of even number from 1 to "+number+" :");
		for (int i=1;i<=number;i++) 
		{
			if (i%2==0)
			{
				System.out.println(i + " ");
			}
		}
	}

}
