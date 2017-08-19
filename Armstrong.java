package guvi3;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0) {
			int r=num%10;
			rev+=r*r*r;
			num/=10;
		}
		if(temp==rev){
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

}
