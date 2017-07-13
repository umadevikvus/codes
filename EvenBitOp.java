package guvi1;

import java.util.Scanner;

public class EvenBitOp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		if( (num & 1) == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}

