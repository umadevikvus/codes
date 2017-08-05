package guvi3;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.next();
		in.close();
		int temp=Integer.parseInt(num);
		int[] arr = new int[num.length()];
		int k =0;
		for(int i=0 ;i<arr.length;i++){
			while(temp!=0){
				arr[k]=temp%10;;
				temp/=10;
				k++;
			}
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}

}
