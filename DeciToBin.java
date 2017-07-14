package lc;

import java.util.Scanner;

public class DeciToBin {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int deci=in.nextInt();
		in.close();
		int bin=0;
		while(deci!=0){
			bin=(bin*10)+deci%2;
			deci/=2;
		}
		System.out.println(bin);
	}
}

