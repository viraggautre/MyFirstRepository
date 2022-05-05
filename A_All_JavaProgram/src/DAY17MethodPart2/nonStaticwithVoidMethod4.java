package DAY17MethodPart2;

public class nonStaticwithVoidMethod4 {

	public static void main(String[] args) {
		nonStaticwithVoidMethod4 m1=new nonStaticwithVoidMethod4();
			 m1.Disply();
			 
			        //OR
			 
		     m1.Disply('A',27,25000); 
		     m1.Disply('B',55,28000);
		     m1.Disply('C',24,21000);
		     m1.Disply('D',44,566666);
}
     void Disply () {
     System.out.println("***Program Start***");
	    char grade = 'A';int age = 25; double salary = 500000;
	 System.out.println("Grade is:- " + grade);
	 System.out.println("Age is:- " + age);
	 System.out.println("Salary is:- " + salary);
     System.out.println("***Program End***");
	 
}
           void Disply(char grade,int age, double salary) {
        	     System.out.println("***Program Start***");
        		 System.out.println("Grade is:- " + grade);
        		 System.out.println("Age is:- " + age);
        		 System.out.println("Salary is:- " + salary);
        	     System.out.println("***Program End***");
           
}          
           void display(int age,char grade,int salary){
       		System.out.println("**********display(int,char,int) with param started*****************");
       		System.out.println("Age-Grade-Salary is: "+age+"-"+grade+"-"+salary);//30-B-45000
       		System.out.println("**********display(int,char,int) with param ends*****************");
       	}
       	void display(int age){
       		System.out.println("**********display() with int param started*****************");
       		System.out.println("Age is: "+age);
       		System.out.println("**********display() with int param ends*****************");
       	}
       	void display(char grade){
       		System.out.println("**********display() with char param started*****************");
       		System.out.println("Grade is: "+grade);
       		System.out.println("**********display() with char param ends*****************");
}
}
/**
 * Method Overloading: when a method declared more dn once in class with different set of argument like:
 * 1. type of argument differ //or
 * 2. number of argument differ  //or
 * 3. position of argument differ
 */        