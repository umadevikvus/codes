package guvi;

import java.util.Scanner;

public class ExitQ {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char chr='\0';
		while(chr!='q'){
			chr=in.next().charAt(0);
			if(chr=='q') {
				System.out.println("exited");
			}
			else{
			System.out.println("Press q to exit");
			}
		}
		in.close();
	}
}

