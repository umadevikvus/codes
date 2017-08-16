package guvi4;

import java.util.Scanner;

public class SumEvenD {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int sum=0;
		while(num>0) {
			int r=num%10;
			if(r%2==0) {
				sum+=r;
			}
			num/=10;
		}
		System.out.println(sum);
	}

}
