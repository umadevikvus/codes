package guvi;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		in.close();
		int i=0;
		int j=0;
		int k=0;
		for(i=0;i<=size;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			for(k=j-2;k>=1;k--){
				System.out.print(k);
			}
			System.out.print(" ");
		}

	}

}
