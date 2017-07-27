package guvi3;

import java.util.Scanner;

public class LargestDiff {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=in.nextInt();
		}
		in.close();
		int max=0;
		int temp1=0;
		int temp2=0;
		for(int i=0;i<n-1;i++){
			if((array[i]-array[i+1])>=max){
				temp1=array[i];
				temp2=array[i+1];
			}
		}
		if(temp1>temp2){
			System.out.println(temp1);
		}
		else{
			System.out.println(temp2);
		}
		
	}

}
