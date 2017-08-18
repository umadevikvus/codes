package guvi4;

import java.util.Scanner;

public class CountAlpha {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')) {
				count++;
			}
		}
		System.out.println(count);
	}
}

