package guvi3;

import java.util.Scanner;

public class CountDup {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		int[] count=new int[26];
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++){
			if(count[i]>1){
			System.out.print((char)(i+'a')+":"+count[i]+" ");
			}
		}

	}

}
