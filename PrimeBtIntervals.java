package guvi1;

import java.util.Scanner;

public class PrimeBtIntervals {

		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			//System.out.println("Enter the starting:");
			//int num1=in.nextInt();
			//System.out.println("Enter the ending:");
			int num2=in.nextInt();
			in.close();
			int sum=0;
			for(int i=2;i<num2;i++){
				int flag=0;
				for(int x=2;x<i;x++){
					if(i%x==0){
						flag=1;
						break;
					}
					else{
						flag=0;
					}
				}
				if(flag==0){
					sum+=i;
				}
			}
			System.out.println(sum);
		}
}
				




