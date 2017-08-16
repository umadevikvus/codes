package guvi4;

import java.util.Scanner;

public class CountEle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] input1=new String[n];
		System.out.println("Input1:");
		for(int i=0;i<n;i++) {
			input1[i]=in.next();
		}
		System.out.println("Input2:");
		String input2=in.next();
		in.close();
		int count=0;
		for(int i=0;i<n;i++) {
			if(input1[i].length()!=input2.length()){
				count++;
			}
		}
		System.out.println(count);
	}

}
