package guvi3;

import java.util.Scanner;

public class OddReverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		in.close();
		String[] word=string.split(" ");
		for(int i = 0 ; i < word.length ; i++){
			if(i%2==0){
				StringBuffer str =new StringBuffer(word[i]).reverse();
				word[i]=str.toString();
			}
			System.out.print(word[i]+" ");
		}
		

	}

}
