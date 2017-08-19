package guvi4;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		int[] sum=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=in.nextInt();
			arr2[i]=in.nextInt();
		}
		in.close();
		for(int i=0;i<n;i++){
			sum[i]=arr1[i]+arr2[i];
			System.out.println(sum[i]);
		}
	}

}
