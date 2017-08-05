package guvi3;

import java.util.Scanner;

public class OneToN {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		int n = in.nextInt();
		in.close();
		num(n);
	}
	public static void num(int n) {
		if( n > 1 ){
			num(n-1);
		}
		System.out.println(n);
	}
}
		
		
		
			
		

