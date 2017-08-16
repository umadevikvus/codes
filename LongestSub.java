package guvi;

import java.util.Scanner;

public class LongestSub {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input=in.next();
		in.close();
		int max=0;
		String output="";
		for(int i=0;i<input.length();i++) {
			for(int j=2;j<input.length()-i;j++) {
				String str=input.substring(i,j+i);
				if(str.length()>max) {
					max=str.length();
					output=str;
				}
			}
		}
		System.out.println(output);
	}
}

