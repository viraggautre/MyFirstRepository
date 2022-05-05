package DAY50StringClass;

public class StringClass01 {
	public static void main(String[] args) {
		 
		StringClass01 c1 =new StringClass01();//String representation of an object becouse of toString() 
		System.out.println("c1:-"+c1);
		
		//String class object creation
		//1.using Literal
		
		String s1="virag";//new object will be create in string constant pool
		String s2="virag";//no object will be create as its a duplicate object, so 's2' will points to 's1' object
		String s3="parany";//new object will be create in string constant pool
		
		System.out.println("s1: " +s1);//object value because toString() is overrided in String class
		System.out.println("s2:"+s2);
		System.out.println("s3: " + s3);
		 System.out.println("s1 char count:-"+s1.length());
		 System.out.println("s2 char count:-"+s2.length());
		 System.out.println("s3 char count:-"+s3.length());
		
		 /**
			 * Outside String class:
			 * 		== --> compare two values
			 * 		.equals(obj) --> compare two objects based on there address
			 * Inside String class:
			 * 		== --> compare two objects based on address
			 * 		.equals(obj) --> compare two objects based value
			 */
		 
		 System.out.println("s1 & s2 using equals():- "+ s1.equals(s2));//compare s1 and s2 values
		 System.out.println("s1 & s2 using '==':- "+ (s1==s2));//compare s1&s2 based  on address
		 
		 System.out.println("s1&s3 using equal():=" + s1.equals(3));//compare s1 & s3 based on address
		 System.out.println("s1&s3 using '==':-"+ (s1==s3));//compare s1 & s3 based on address
		 
		 String s4=new String("virag");//two objects--> 1. in constant pool 2. in non-constant pool
		 System.out.println("s4:="+s4);//object value because toString() is overrided in String class
		 
		 System.out.println("s1&s4 using equals:-"+ s1.equals(s4));//compare s1 and s4 values --> true
		 System.out.println("s1&s4 using '==':-"+(s1==s4));//compare s1 and s4 Address-->false
		 
		 String s5 =new String("virag");//two objects--> 1. in constant pool 2. in non-constant pool
		 System.out.println("s5:-" + s5);
		 
		 System.out.println("s1&s5 using equals:-"+s1.equals(s5));//compare s5 and s4 values --> true
		 String s6=new String("Hyderabad");//two objects--> 1. in constant pool 2. in non-constant pool
		System.out.println("s6: "+s6);
		System.out.println("s1 & s6 using equals(): "+s1.equals(s6));//compare s1 and s6 values --> true
		System.out.println("s1 & s6 using '==': "+(s5==s6));//compare s1 & s6 based on address --> false
		 
	}

}
