package lc;

import java.util.Scanner;

public class BinToDeci{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int bin=in.nextInt();
		in.close();
		int base=1;
		int r=0;
		int deci=0;
		while(bin!=0){
			r=bin%10;
			deci=deci+(r*base);
			bin/=10;
			base*=2;
		}
		System.out.println(deci);
	}
}

