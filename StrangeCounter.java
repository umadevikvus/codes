package guvi4;

import java.util.Scanner;

public class StrangeCounter {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the time in seconds:");
		int t=in.nextInt();
		System.out.println("Starting value of counter:");
		int x=in.nextInt();
		in.close();
		int n=x;
		int value=0;
		x=x+1;
		for(int i=1;i<=t;i++) {
			x=x-1;
			if(x==0){
				x=n*2;
				n=x;
			}
			if(i==t){
				value=x;
			}
			//System.out.println(x);
		}
		System.out.println(value);
	}
}
