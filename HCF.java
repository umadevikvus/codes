package guvi;

import java.util.Scanner;

public class HCF {

	public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        in.close();
        int  t=0;
        int hcf=0;
        int a = n1;
        int b = n2;
		while(b != 0)
        {
            t = b;
            b = a%b;
            a = t;
        }
		hcf = a;
       System.out.print("HCF = " +hcf);
       
    }
}

