package guvi1;

import java.util.Scanner;

public class GAmongTen {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] arr=new int[10];
		int max=0;
		for(int i=0;i<10;i++){
			arr[i]=in.nextInt();
			if(arr[i]>max){
				max=arr[i];
			}
		}
		in.close();
		System.out.println(max);
	}
}
		

