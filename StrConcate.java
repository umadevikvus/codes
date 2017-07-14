package guvi2;

import java.util.Scanner;

public class StrConcate {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string1=in.next();
		String string2=in.next();
		in.close();
		int l1=string1.length();
		int l2=string2.length();
		if(l1>l2){
			System.out.println(string1.substring(l1-l2)+string2);
		}
		else if(l2>l1){
			System.out.println(string2.substring(l2-l1)+string1);
		}
		else if(l2==l1){
			System.out.println(string1+string2);
		}
	}

}
