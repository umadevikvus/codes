package guvi4;

import java.util.Scanner;

public class CountRepeat {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next().toLowerCase();
		in.close();
		int[] count=new int[26];
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(ch>='a'&&ch<='z') {
				count[ch-'a']++;
			}
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				System.out.print((char)(i+'a')+""+count[i]);
			}
		}

	}

}
