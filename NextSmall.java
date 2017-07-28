package guvi3;

import java.util.Scanner;

public class NextSmall {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		int max=0;
		for( int i = 0 ; i < n ; i++ ){
			array[i] = in.nextInt();
		}
		for( int i = 0 ; i < n-1 ; i++ ){
			if( array[i] > array[i+1]){
				array[i] = array [i+1];
			}
			else{
				array[i] = -1;
			}
		}
		array[n-1] = -1;
		for( int i = 0 ; i < n ; i++ ){
			System.out.println( array[i] );
		}
	}

}
