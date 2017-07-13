package guvi1;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		String[] s=str.split(" ");
		int num=s.length;
		System.out.println(num);
	}

}
