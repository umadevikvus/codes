package guvi;

import java.util.Scanner;

public class StarBetweenIdentical {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==(str.charAt(i+1))){
				String front=str.substring(0,i+1);
				String end=str.substring(i+1);
				str=front+'*'+end;
			}
		}
		System.out.println(str);
	}

}
