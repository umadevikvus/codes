package guvi3;

import java.util.Scanner;

public class SquareOrNot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x1=in.nextInt();
		int x2=in.nextInt();
		int x3=in.nextInt();
		int x4=in.nextInt();
		int y1=in.nextInt();
		int y2=in.nextInt();
		int y3=in.nextInt();
		int y4=in.nextInt();
		in.close();
		int p=x1-x3;
		int q=x2-x4;
		int r=y1-y3;
		int s=y2-y4;
		int a=((p*p)+(q*q));
		int b=((r*r)+(s*s));
		if(a==b){
			System.out.println("Square");
		}
		else{
			System.out.println("Not a Square");
		}

	}

}
