package guvi3;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" : "+i*n);
		}

	}

}