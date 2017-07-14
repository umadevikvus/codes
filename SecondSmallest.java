package guvi2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=in.nextInt();
		}
		in.close();
		Arrays.sort(array);
		System.out.println(array[n-2]);
	}

}
