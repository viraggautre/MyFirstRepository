package DAY47_48SingleTon;
/*
 *1.create private constructor
 *2.create static reference variable
 *3.create static method which return current class object 
 */

class sampalton{
	//1.create private constructor
	private sampalton() {
		System.out.println("i am constructor");
	}
	//2.create static reference  variable of the class
	  static sampalton obj =new  sampalton();
	  
	  //3.create static method which return current class object 
	  public static sampalton getsampltonobj() {
		  return obj;
	  }
	  
}
 public class demoSampleton {

	public static void main(String[] args) {
		sampalton ss5 = sampalton.getsampltonobj();

	}

}
