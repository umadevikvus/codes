package guvi4;

import java.util.Scanner;

public class ArmstrongBtInter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		in.close();
		int temp=0;
		for(int i=n1;i<=n2;i++) {
			temp=i;
			int rev=0;
			while(temp!=0) {
				int r=temp%10;
				rev+=r*r*r;
				temp/=10;
			}
			if(i==rev) {
				System.out.println(rev);
			}
		}

	}

}
