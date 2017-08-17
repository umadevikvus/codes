package guvi;

import java.util.Scanner;

public class HCFAndLCM {

	public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
		in.close();
        System.out.print("Enter Two Number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int  t=0;
        int hcf=0;
        int lcm=0;
		int a = n1;
        int b = n2;
		while(b != 0)
        {
            t = b;
            b = a%b;
            System.out.println(b);
            a = t;
        }
		hcf = a;
        lcm = (n1*n2)/hcf;
		System.out.print("HCF = " +hcf);
        System.out.print("\nLCM = " +lcm);
    }
}

