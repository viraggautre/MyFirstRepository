package DAY41Eencapsulation;

class student2{
	private String college="ABC";
			
	public void setCollege(String college) {
		this.college=college;
	}
}




public class EncapsulationWriteOnly07 {

	public static void main(String[] args) {
		
		student2 obj = new student2();
		
		 obj.setCollege("XYZ");
		 student2 s1 = new student2();
		 
		 System.out.println("bshf");
	}

}
