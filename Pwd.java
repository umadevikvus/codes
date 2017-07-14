package guvi2;

import java.util.Scanner;

public class Pwd {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str=in.next();
	int num=in.nextInt();
	String temp=Integer.toString(num);
	in.close();
	char[] ch=new char[4];
	ch[3]=str.charAt(str.length()-1);
	//System.out.println(ch[3]);
	int sum=10;
	while(sum>=10){
		sum=0;
		while(num!=0){
			sum+=num%10;
			num/=10;
		}
		num=sum;
	}
	ch[2]=Integer.toString(sum).charAt(0);
	 ch[1]=str.charAt(0);
	if(ch[1]>='a'&&ch[1]<='z'){
		ch[1]=Character.toUpperCase(ch[1]);
	}
	else if(ch[1]>='A'&&ch[1]<='Z'){
		ch[1]=Character.toLowerCase(ch[1]);
	}
	ch[0]=temp.charAt(temp.length()-3);
	for(int i=0;i<4;i++){
		System.out.print(ch[i]);
	}
	
	}
}

