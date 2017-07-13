package guvi1;

import java.util.Scanner;

public class NumberOfChar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if((ch[i]>=65&&ch[i]<=90)||(ch[i]>=97&&ch[i]<=122)){
				count++;
			}
		}
		System.out.println(count);
	}

}
