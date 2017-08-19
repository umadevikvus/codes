package guvi3;

import java.util.Scanner;

public class DigOrNot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		if(str.charAt(0)>='0'&&str.charAt(0)<='9') {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
