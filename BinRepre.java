package guvi3;

import java.util.Scanner;

public class BinRepre {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int n=(int)Math.pow(2, num);
		for(int i=0;i<n;i++){
		System.out.println(Integer.toBinaryString(i));	
		}
		}
}
