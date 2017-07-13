package guvi1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		int num2=in.nextInt();
		in.close();
		int t;
		t=num1;
		num1=num2;
		num2=t;
		System.out.println(num1);
		System.out.println(num2);

	}

}
