package DAY49SystemClass;

import java.util.Scanner;

public class ScannerClass04 {

	public static void main(String[] args) {
		 

		//object creating of scanner class
		Scanner scnRef=new Scanner(System.in);
		int age;
		double salary;
		String Name;
		boolean valid;
		/* Initialization of variable using scanner class*/
		System.out.println("Get age value from console");
		age=scnRef.nextInt();
		System.out.println("Get salary value from console");
		salary=scnRef.nextDouble();
		System.out.println("Get name from console ");
	 	Name=scnRef.next();
		System.out.println("GEt valid value from console");
		valid=scnRef.nextBoolean();
		
		System.out.println("age:" +age);
		System.out.println("salary:"+salary);
		System.out.println("Name:"+Name);
		System.out.println("valid:"+valid);
		
		int num1,num2;
		System.out.println("Enter num1: ");
		 num1=scnRef.nextInt();
		System.out.println("Enter num2: ");
		num2=scnRef.nextInt();
		
		char op;
		System.out.println("Enter op: ");
		op=scnRef.next().charAt(0);
		System.out.println("Adddition of two number: "+addNumber(op,num1,num2));
		System.out.println("*************************************************");
		 
	}

	  static int addNumber(char op, int num1, int num2) {
		 if(op=='+') {
			return num1+num2; 
		 }
		return 0;
	}

 
	}


