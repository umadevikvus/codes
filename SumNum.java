package guvi4;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] string=new String[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			string[i]=in.next();
			for(int j=0;j<string[i].length();j++) {
				char ch=string[i].charAt(j);
				if(ch>='0'&&ch<='9') {
					sum+=Character.getNumericValue(ch);
				}
			}
		}
		in.close();
		System.out.println(sum);
	}

}
