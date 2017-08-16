package guvi4;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input=in.next();
		in.close();
		if(input.charAt(0)=='-'){
			System.out.println(input);
		}
		else{
			System.out.println("-1");
		}

	}

}
