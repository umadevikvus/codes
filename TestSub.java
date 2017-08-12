package guvi4;

import java.util.Scanner;

public class TestSub {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		String string2=in.next();
		in.close();
		int n=0;
		int flag=0;
		for(int i=0;i<string.length();i++) {
			if(string.contains(string2)){
				flag=1;
				n=string.indexOf(string2);
			}
			else{
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println(n);
		}
		else {
			System.out.println("-1");
		}
	}
}

