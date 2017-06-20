package guvi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int reminder=0;
		int reverse=0;
		int temp=num;
		while(num!=0){
			reminder=num%10;
			reverse=(reverse*10)+reminder;
			num/=10;
		}
		if(reverse==temp){
			System.out.println(temp+" is palindrome");
		}
		else{
			System.out.println(temp+" is not a palindrome");
		}
	}

}
