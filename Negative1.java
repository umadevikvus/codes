package guvi4;

import java.util.Scanner;

public class Negative1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next();
		int num=Integer.parseInt(string);
		in.close();
		if(string.charAt(0)=='-'){
			System.out.println(Math.abs(num));
		}
		else{
			System.out.println("-1");
		}

	}

}
