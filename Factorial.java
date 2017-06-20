package guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int fact=1,number,i;
		number=in.nextInt();
		in.close();
		for(i=1;i<=number;i++){
			fact*=i;
		}
		System.out.println(fact);
	}

}
