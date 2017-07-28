package guvi3;

import java.util.Scanner;

public class Expand {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		in.close();
		int[] num = new int[10];
		String output="";
		int x=0;
		for( int i = 0 ; i < string.length() ; i++ ){
			if( Character.isDigit( string.charAt(i) ) ){
				num[x] = Character.getNumericValue( string.charAt(i) );
			}
			for( int j = 0 ; j < num[x] ; j++ ){
				output+=string.charAt(i-1);
			}
			x++;
		}
			System.out.println(output);
	}
}
		
