package guvi1;

import java.util.Scanner;

public class NumberOfLines {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		in.close();
		int count=1;
		while(!s.contains("end")){
			s=in.nextLine();
			count++;
		}
		System.out.println(count);
	}

}
