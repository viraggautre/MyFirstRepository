package DAY49SystemClass;

public class SystemDemo02 {

	public static void main(String[] args) {
		 
		//checking specific property
		System.out.println("system user Directory:"+System.getProperty("user.home") );
		System.out.println("Current working Directory:"+System.getProperty("user.dir"));
		
		//clearing this property
		System.clearProperty("user.home");
		System.out.println(System.clearProperty("user.home"));
		
		//setting specific property
		System.setProperty("user.country", "IND");
		//checking property
		System.out.println(System.setProperty("user.country", "IND"));
		
		// checking property other than system property
		// illustrating getProperty(String key, String def)
		System.out.println("other than system property: "+System.getProperty("user.password", "none of your business"));

		System.out.println("difference between the current time and midnight, January 1, 1970 UTC is: "
				+ System.currentTimeMillis());
		System.out.println("current time in " + "nano sec: " + System.nanoTime());
		
	}

}
