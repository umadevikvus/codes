package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class DelKDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=n;
		int k=in.nextInt();
		in.close();
		int count=0;
		while(temp!=0){
			count++;
			temp/=10;
		}
		int[] array=new int[count];
		for(int i=0;i<count;i++){
			array[i]=n%10;
			n/=10;
		}
		Arrays.sort(array);
		for(int i=0;i<(count-k);i++){
			System.out.print(array[i]);
		}
	}

}
