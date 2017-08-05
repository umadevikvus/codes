package guvi3;

import java.util.Scanner;

public class LuckyReg {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		String reg = in.next();
		in.close();
		String[] split = reg.split("T");
		int[] sum = new int[split.length];
		int[] last = new int[split.length];
		for( int i = 0 ; i < split.length ; i++ ) {
			last[i] = 0;
			for( int j = 4 ; j < split[i].length() ; j++) {
				
				last[i] += split[i].charAt(j) - '0';
			}
		}
		for(int i=0;i<split.length;i++) {
			sum[i]=10;
		}
		for( int i = 0 ; i < last.length ; i++ ) {
			while(sum[i]>=10){
				sum[i] = 0;
				while(last[i]!=0){
				sum[i] += last[i]%10;
				last[i]/=10;
				}
				last[i]=sum[i];
			}
			if(sum[i]==5||sum[i]==7) {
				System.out.println("T"+split[i]);
			}
		}
	
	}

}
