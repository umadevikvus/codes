package guvi4;

import java.util.Scanner;

public class StrOddEven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		String even="";
		String odd="";
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				even+=str.charAt(i);
			}
			else {
				odd+=str.charAt(i);
			}
		}
		System.out.println(even+" "+odd);
	}

}
