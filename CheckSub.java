package guvi3;

import java.util.Scanner;

public class CheckSub {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println( "String1:" );
		String string1 = in.next();
		System.out.println( "String2:" );
		String string2 = in.next();
		in.close();
		String temp = "";
		String temp1 = "";
		for( int i = 0 ; i < string1.length() ; i++ ){
			for( int j = 1 ; j <= string1.length()-i ; j++ ){
				temp += " "+string1.substring( i , j+i );
			}
		}
		System.out.println( temp );
		String[] sub1 = temp.split(" ");
		for( int i = 0 ; i < string2.length() ; i++ ){
			for( int j = 1 ; j <= string2.length()-i ; j++ ){
				temp1 += " "+string2.substring( i , j+i );
			}
		}
		System.out.println( temp1 );
		String[] sub2 = temp.split(" ");
		int max = 0;
		String output = "";
		String output1 = "";
		for( int i = 0 ; i < sub1.length ; i++ ){
			for( int j=0;j<sub2.length;j++){
			if(sub1[i].equals(sub2[j])){
				output=sub1[i];
				if( output.length() != 0 ){
				if( output.length() > max ){
					max = output.length();
					output1 = output;
				}
				}
			}
			}
		}
		System.out.println( output1 );
	}
}
