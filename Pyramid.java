package guvi3;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=0;i<n;i++){
			for(int k=0;k<n-i;k++){
			System.out.print(" ");
			}
			for(int j=0;j<i+1;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}


