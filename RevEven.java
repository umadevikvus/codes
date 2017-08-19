package guvi4;

import java.util.Scanner;

public class RevEven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		String[] word=str.split(" ");
		for(int i=0;i<word.length;i++) {
			if(i%2==0) {
			StringBuffer s=new StringBuffer(word[i]).reverse();
			word[i]=s.toString();
			}
		}
		for(int i=0;i<word.length;i++) {
			System.out.print(word[i]+" ");
		}
	}
}
			

