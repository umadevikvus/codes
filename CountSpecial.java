package guvi1;

import java.util.Scanner;

public class CountSpecial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		int count=0;
		for(int i=0;i<str.length();i++){
		 char ch=str.charAt(i);
			if((ch>='A'&&ch<'z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')){
				continue;
			}
			else{
				count++;
			}
		}
		System.out.println(count);
	}
}

