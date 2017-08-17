package guvi4;

import java.util.Scanner;

public class StrangeCounter1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the time in seconds:");
		int t=in.nextInt();
		in.close();
		int x=3;
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
