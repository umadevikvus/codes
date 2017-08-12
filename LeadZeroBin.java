package wc;

import java.util.Scanner;

public class LeadZeroBin {

   public static void main(String[] args) {
	   Scanner in=new Scanner(System.in);
	   int num=in.nextInt();
	   in.close();
	   if(num>=1&&num<=255){
		   System.out.println((String.format("%14s",Integer.toBinaryString(num))).replace(" ","0"));
	   }
	   else{
		   System.out.println("Invalid Input");
	   }
   }
}

