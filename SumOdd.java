package guvi3;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
