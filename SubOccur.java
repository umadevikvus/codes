package guvi;

import java.util.Scanner;

public class SubOccur {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next();
		in.close();
		int count=0;
		for(int i=0;i<string.length();i++) {
			for(int j=1;j<string.length()-i;j++) {
				//String str=string.substring(i,j+i);
				count++;
			}
		}
		System.out.println(count);
	}

}
