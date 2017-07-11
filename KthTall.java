package guvi1;

import java.util.Arrays;
import java.util.Scanner;

public class KthTall {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] arr=new int[50];
		for(int i=0;i<50;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<50;i++){
			System.out.println(arr[i]);
		}
		System.out.println("The fourth tallest:"+arr[arr.length-4]);
		System.out.println("Enter k value:");
		int k=in.nextInt();
		in.close();
		System.out.println("Kth tallsest is:"+arr[arr.length-k]);
	}

}
