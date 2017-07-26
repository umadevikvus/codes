package guvi2;

import java.util.Scanner;

public class StringNum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input1:");
		String string1=in.next();
		System.out.println("Input2:");
		String string2=in.next();
		in.close();
		int num1=Integer.parseInt(string1);
		int num2=Integer.parseInt(string2);
		long output=num1*num2;
		String result=Integer.toString((int) output);
		System.out.println(result);
	}
}


