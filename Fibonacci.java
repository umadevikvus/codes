package guvi;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" "+n2);
		for(int i=0;i<num;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
				

	}

}
