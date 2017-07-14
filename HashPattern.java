package guvi2;

import java.util.Scanner;

public class HashPattern {
 public static void main(String[] args){
	 Scanner in=new Scanner(System.in);
	 int num=in.nextInt();
	 in.close();
	 for(int i=0;i<num;i++){
		 for(int j=0;j<i+1;j++){
			 System.out.print("#");
		 }
		 System.out.println();
	 }
 }
}
