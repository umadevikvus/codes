package guvi1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
