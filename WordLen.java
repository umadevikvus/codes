package guvi3;

import java.util.Scanner;

public class WordLen {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Array size:");
		int n=in.nextInt();
		String[] str=new String[n];
		System.out.println("Given length:");
		int gLen=in.nextInt();
		int count=0;
		System.out.println("Array elements:");
		for(int i=0;i<n;i++) {
			str[i]=in.next();
			if(str[i].length()==gLen){
				count++;
			}
		}
		in.close();
		System.out.println(count);
	}

}
