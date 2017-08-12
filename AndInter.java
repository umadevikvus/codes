package guvi4;

import java.util.Scanner;

public class AndInter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		in.close();
		String[] word=string.split(" ");
		String temp="";
		for(int i=0;i<word.length;i++) {
			if(word[i].equalsIgnoreCase("and")) {
				temp=word[i-1];
				word[i-1]=word[i+1];
				word[i+1]=temp;
			}
		}
		for(int i=0;i<word.length;i++) {
			System.out.print(word[i]+" ");
		}
	}

}
