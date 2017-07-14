package guvi2;

import java.util.Scanner;

public class ReverseHyphen {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next();
		in.close();
		String newStr="";
		for(int i=string.length()-1;i>0;i--){
			char ch=string.charAt(i);
			newStr+=ch+"-";
		}
		System.out.println(newStr+string.charAt(0));
	}

}
