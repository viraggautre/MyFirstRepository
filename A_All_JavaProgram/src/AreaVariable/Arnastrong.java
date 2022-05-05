package AreaVariable;

public class Arnastrong {

	public static void main(String[] args) {
		
		System.out.println(test(1634));
		
	}
		static boolean  test (int num) {
				int temp,ct = 0,rem=0;
				double sum=0;
				temp=num;
				while(temp>0) {
					temp=temp/10;
					ct++;
						}
			temp=num;
				while(temp>0) {
					rem=temp%10;
					sum=sum+Math.pow(rem, ct);
					temp=temp/10;
				}
				if(sum==num) {
					return true;
				}else {
					return false;
				}		
			}
		static boolean isArmStrong(int num) {
			
			int temp,rem=0;
			double sum = 0;
			temp=num;
			while(temp>0) {
				rem=temp%10;
				sum = sum+Math.pow(rem,3);
				temp = temp/10;
			}
			if(num==sum) {
				return true;
			}
			else {
				return false;
			}
		}
}

	


