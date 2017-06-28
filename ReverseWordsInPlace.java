package hunter.strings;

import java.util.Scanner;

public class ReverseWordsInPlace {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		String[] st=str.split(" ");
		String rev="";
		for(int i=st.length-1;i>=0;i--){
			rev+=st[i]+" ";
		}
		System.out.println(rev);
	}

}
