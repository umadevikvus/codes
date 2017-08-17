package guvi;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int rev=0;
		while(num!=0) {
			int r=num%10;
			rev=(rev*10)+r;
			num/=10;
		}
		System.out.println(rev);
	}

}
