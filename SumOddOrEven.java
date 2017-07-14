package guvi2;

import java.util.Scanner;

public class SumOddOrEven {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	int sum=0;
	int r=0;
	while(num!=0){
		r=num%10;
		if(num%2!=0){
			sum+=r;
		}
		num/=10;
	}
	System.out.println(sum);
	if(sum%2==0){
		System.out.println("-1");
	}
	else{
		System.out.println("1");
	}
	}
}


