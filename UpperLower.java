package guvi3;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string= in.next();
		in.close();
		char ch = '\0';
		String result = "";
		for(int i=0 ;i<string.length();i++){
			if(string.charAt(i)>='A'&&string.charAt(i)<='Z'){
				ch=Character.toLowerCase(string.charAt(i));
			}
			else if(string.charAt(i)>='a'&&string.charAt(i)<='z'){
				ch=Character.toUpperCase(string.charAt(i));
			}
			result += ch;
		}
		System.out.println(result);
	}

}
