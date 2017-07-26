package guvi1;

import java.util.Scanner;

public class PrimeEndThree {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int n1=0;
		int sum=0;
		for(int i=2;i<=n;i++){
			int f=0;
			n1+=1;
			for(int x=2;x<=n1;x++){
				if(i%x==0){
					f=1;
					break;
				}
			}
			if(f==0){
				if(i%10==3){
					sum+=i;
					//System.out.println(i);
				}
			}
		}
		System.out.println(sum);
	}
}

