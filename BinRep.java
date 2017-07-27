package guvi3;

import java.util.Scanner;

public class BinRep {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=in.nextInt();
		int[] deci=new int[n];
		int[] bin=new int[n];
		int[]temp=new int[n];
		for(int i=0;i<n;i++){
			deci[i]=in.nextInt();
			temp[i]=deci[i];
			while(deci[i]!=0){
				bin[i]=(bin[i]*10)+deci[i]%2;
				deci[i]/=2;
			}
		}
		in.close();
		int[] count=new int[n];
		int max=0;
		for(int i=0;i<n;i++){
			while(bin[i]!=0){
				int r=bin[i]%10;
				if(r==1){
					count[i]++;
				}
				bin[i]/=10;
			}
			if(count[i]>=max){
				max=temp[i];
			}
		}
		System.out.println(max);
	}
}
	
