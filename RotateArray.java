package guvi3;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=in.nextInt();
		}
		int d=in.nextInt();
		String s1="";
		String s2="";
		in.close();
		for(int i=0;i<n;i++){
			if(!(i>(d-1))){
				s1+=Integer.toString(array[i]);
			}
			else{
				s2+=Integer.toString(array[i]);
			}
		}
		System.out.println(s2+s1);
	}

}
