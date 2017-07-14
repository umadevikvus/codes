package guvi2;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next();
		String str=in.next();
		in.close();
		int flag=0;
		while(string.contains(str)){
			flag=1;
			break;
		}
		if(flag==1){
			System.out.println("True");
		}
	}

}
