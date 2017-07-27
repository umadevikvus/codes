package guvi3;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String mailId=in.next();
		String front="";
		String end="";
		in.close();
		int c=0;
		for(int i=0;i<mailId.length();i++){
			if(mailId.charAt(i)=='@'){
				c++;
			}
		}
		for(int i=0;i<mailId.length();i++){
			if(c==1){
				if(mailId.charAt(i)=='@'){
					front=mailId.substring(0,i);
					end=mailId.substring(i+1);
				}
			}
		}
		
		for(int i=0;i<end.length();i++){
			if(end.charAt(i)=='.'){
				end=end.substring(0,i);
			}
		}
		if(front.length()>=3){
			if(end.length()>=4){
				if(mailId.substring(mailId.length()-4).equals(".com")){
					System.out.println("true");
				}
			}
		}
		else{
			System.out.println("false");
		}
	}
}

