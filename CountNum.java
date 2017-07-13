package guvi1;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='0'&&ch[i]<='9'){
				count++;
			}
		}
		System.out.println(count);
	}
}

