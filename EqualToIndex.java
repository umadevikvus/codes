package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class EqualToIndex {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			array[i]=in.nextInt();
		}
		in.close();
		Arrays.sort(array);
		System.out.println("the array element which are equal to its index are:");
		for(int i=0;i<n;i++){
			if(array[i]==i){
				System.out.println(i);
			}
		}

	}

}
