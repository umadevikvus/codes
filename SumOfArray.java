package guvi3;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] array=new int[25];
		int sum=0;
		for(int i=0;i<25;i++) {
			array[i]=in.nextInt();
			sum+=array[i];
		}
		in.close();
		System.out.println(sum);
	}

}
