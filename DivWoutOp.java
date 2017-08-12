package guvi4;

import java.util.Scanner;

public class DivWoutOp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		in.close();
		int count=0;
		while(n1>0) {
			n1-=n2;
			count++;
		}
		System.out.println(count);
	}

}
