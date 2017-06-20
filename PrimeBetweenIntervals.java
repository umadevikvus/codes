package guvi;

import java.util.Scanner;

public class PrimeBetweenIntervals {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the starting:");
		int num1=in.nextInt();
		System.out.println("Enter the ending:");
		int num2=in.nextInt();
		in.close();
		for(int i=num1;i<num2;i+=2){
			int flag=0;
			for(int x=2;x<i/2;x++){
				if(i%x==0){
					flag=1;
				}
			}
			if(flag==0){
				System.out.println(i);
			}
		}
	}
}
			

