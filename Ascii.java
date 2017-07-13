package guvi1;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		int num=0;
		int sum=0;
		for(int i=0;i<str.length();i++){
			num=(int)str.charAt(i);
			sum+=num;
		}
		sum/=str.length();;
		System.out.println((char) sum);
	}

}
