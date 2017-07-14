package guvi2;

import java.util.Scanner;

public class SecondUpper {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		char ch=str.charAt(0);
		char ch1=Character.toUpperCase(str.charAt(1));
		System.out.print(ch);
		System.out.print(ch1+str.substring(2));

	}

}
