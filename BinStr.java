package guvi3;

import java.util.Scanner;

public class BinStr {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		String bin=Integer.toBinaryString(num);
		for(int i=0;i<bin.length();i++) {
			for(int j=2;j<bin.length()-i;j++) {
				String str=bin.substring(i,j+i);
				if(str.charAt(0)=='1'&&str.charAt(str.length()-1)=='0') {
					System.out.println(str);
				}
			}
		}
	}

}
