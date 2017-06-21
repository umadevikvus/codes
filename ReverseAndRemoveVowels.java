package guvi;

import java.util.Scanner;

public class ReverseAndRemoveVowels {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String word=in.next();
		in.close();
		StringBuffer revWord=new StringBuffer(word).reverse();
		String word1=revWord.toString();
		String front="";
		String end="";
		for(int i=0;i<word1.length();i++){
			char c=word1.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')){
				front=word1.substring(0,i);
				end=word1.substring(i+1);
				word1=front+end;
			}
		}
		System.out.println(word1);

	}

}
