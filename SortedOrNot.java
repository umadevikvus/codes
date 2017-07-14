package guvi1;

import java.util.Arrays;
import java.util.Scanner;

public class SortedOrNot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] array=new int[n];
		int[] temp=new int[n];
		for(int i=0;i<n;i++){
			array[i]=in.nextInt();
			temp[i]=array[i];
		}
		in.close();
		Arrays.sort(array);
		int count=0;
		for(int i=0;i<n;i++){
			if(array[i]==temp[i]){
				count++;
			}
		}
		if(count==n){
			System.out.println("sorted");
		}
		else{
			System.out.println("unsorted");
		}
	}
}

