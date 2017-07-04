package guvi;

import java.util.Scanner;

public class SquareOfAParticularDigit {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		in.close();
		String s1="";
		for(int i=0;i<s.length();i++){
			int num=s.charAt(i)-'0';
			if(num>=0&&num<=9){
				s1+=num;
			}
		}
		int num=Integer.parseInt(s1);
		int temp=num;
		int temp1=num;
		int max=0;
		int min=999;
		while(temp!=0){
			int r=temp%10;
			if(r>max){
				max=r;
			}
			else if(r<min){
				min=r;
			}
			temp/=10;
		}
		
		int summ=0;
		while(temp1!=0){
			summ+=max*(temp1%10);
			temp1/=10;
		}
		int sum1=10;
		while(sum1>=10){
			sum1=0;
			while(summ!=0){
				sum1+=(summ%10);
				summ/=10;
			}
			summ=sum1;
		}
		int sumn=1;
		while(num!=0){
			sumn*=min+(num%10);
			num/=10;
		}
		int sum2=10;
		while(sum2>=10){
			sum2=0;
			while(sumn!=0){
				sum2+=(sumn%10);
				sumn/=10;
			}
			sumn=sum2;
		}
		int digit3=0;
		if(sum1<sum2){
			digit3=sum1;
		}
		else{
			digit3=sum2;
		}
		System.out.println(digit3*digit3);
	}

}
