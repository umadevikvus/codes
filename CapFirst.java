package guvi3;

import java.util.Scanner;

public class CapFirst {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		String[] word=str.split(" ");
		for(int i=0;i<word.length;i++){
			char ch=word[i].charAt(0);
			if(ch>='a'&&ch<='z'){
				System.out.print((char)(ch-32)+word[i].substring(1)+" ");
		}
	}

}
}
