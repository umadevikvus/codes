package guvi2;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();
		in.close();
		String[] word=line.split(" ");
		int count=word.length;
		System.out.println(count);
	}

}
