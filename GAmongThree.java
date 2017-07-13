package guvi1;

import java.util.Scanner;

public class GAmongThree {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] array=new int[3];
		int max=0;
		for(int i=0;i<3;i++){
			array[i]=in.nextInt();
			if(array[i]>max){
				max=array[i];
			}
		}
		in.close();
		System.out.println(max);
	}

}
