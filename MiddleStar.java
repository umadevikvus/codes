package guvi4;

import java.util.Scanner;

public class MiddleStar {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next();
		in.close();
		String str="";
		if(string.length()%2!=0) {
			str=string.substring(0,string.length()/2)+'*'+string.substring((string.length()/2)+1);
		}
		else {
			str=string.substring(0,string.length()/2)+'*'+string.substring(string.length()/2);
		}
		StringBuffer s=new StringBuffer(str).reverse();
		System.out.println(s);
	}
}
