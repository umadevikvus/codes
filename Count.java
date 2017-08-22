package guvi3;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		int alpha=0;
		int num=0;
		int spc=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				alpha++;
			}
			else if(ch>='0'&&ch<='9') {
				num++;
			}
			else {
				spc++;
			}
		}
		System.out.println("alpha:"+alpha+" number:"+num+" special:"+spc);
	}

}
