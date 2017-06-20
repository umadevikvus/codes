package guvi;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int f=0;
		for(int i=2;i<=(num/2);i++){
			if(num%i==0){
				f=1;
			}
		}
		if(f==0){
			System.out.println(num+" is prime");
		}
		else{
			System.out.println(num+" is not a prime");
		}
	}

}
