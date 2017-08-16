package guvi4;

import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next();
		in.close();
		String vowels="";
		String consonants="";
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
				vowels+=ch;
			}
			else{
				consonants+=ch;
			}
		}
		System.out.println(vowels+""+consonants);
	}

}
