package guvi4;

import java.util.Scanner;

public class RemAlpha {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		String output="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				output+=str.charAt(i);
			}
		}
		System.out.println(output);
	}
}

