package guvi3;

import java.util.Scanner;

public class ISBNNum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum=0;
		int num=in.nextInt();
		in.close();
		for(int i=1;i<=10;i++) {
			int r=num%10;
			sum+=(i*r);
			num/=10;
		}
		if(sum%11==0) {
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}

}
