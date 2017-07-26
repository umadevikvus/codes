package guvi3;

import java.util.Scanner;

public class PowerNext {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next();
		in.close();
		int sum=0;
		int mul;
		for(int i=0;i<string.length()-1;i++){
			int num1=Character.getNumericValue(string.charAt(i));
			int num2=Character.getNumericValue(string.charAt(i+1));
			mul=1;
			for(int k=0;k<num2;k++){
				mul *= num1;
			}
			sum += mul;
		}
		int last=Character.getNumericValue(string.charAt(string.length()-1));
		System.out.println(sum + last);
	}
}
