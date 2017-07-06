package guvi1;

import java.util.Scanner;

public class NumString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		in.close();
		try{
			@SuppressWarnings("unused")
			int n=Integer.parseInt(s);
			System.out.println("true");
		}
		catch(NumberFormatException n){
			System.out.println("false");
		}
	}

}
