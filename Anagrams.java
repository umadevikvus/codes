package guvi2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string1:");
		String string1=in.next();
		System.out.println("Enter String2");
		String string2=in.next();
		in.close();
		char[] ch=string1.toLowerCase().toCharArray();
		char[] ch1=string2.toLowerCase().toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		int count=0;
		if(string1.length()==string2.length()){
			for(int i=0;i<ch.length;i++){
				if(ch[i]==ch1[i]){
					count++;
				}
			}
		}
		if(count==ch.length){
			System.out.println(string1+" and "+string2+" are Anagrams");
		}
		else{
			System.out.println(string1+" and "+string2+" are Not Anagrams");
		}
		
		

	}

}
