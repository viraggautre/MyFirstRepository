package DAY18MethodOverloading;

class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    
    public void callMe() {
    	System.out.println("I am callMe() of DisplayOverloading class");
    }
}
public class MethodOverloading05
{
	void display() {
		System.out.println("I am display() of MethodOverloading05 class");
	}
   public static void main(String args[]){
	   
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
       obj.callMe();
       
       MethodOverloading05 m1=new MethodOverloading05();
       m1.display();
   }
}