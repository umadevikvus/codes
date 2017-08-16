package guvi4;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		in.close();
		String[] word=string.split(" ");
		for( int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+" ");
		}

	}

}
