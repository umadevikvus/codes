package logic;

public class Encryption2 {
	public static String output1;
	public static void main( String [] args ) {
	encryption( "java" );
}
	public static void encryption(String input1) {
		char last=input1.charAt(input1.length()-1);
		int key=0;
		if(last>=65&&last<=90){
			key=last-'A'+1;
		}
		else if(last>=97&&last<=122){
			key=last-'a'+1;
		}
		//System.out.println(key);
		int[] arr=new int[input1.length()-1];
		char[] ch=input1.toCharArray();
		for(int i=0;i<arr.length;i++){
			char ch1=input1.charAt(i);
			if(ch1>=65&&ch1<=90){
				arr[i]=(int)ch1-'A'+1;
				arr[i]-=key;
				if(arr[i]<=0){
					arr[i]+=26;
				}
				ch[i]=((char)(arr[i]+64));
			}
			if(ch1>=97&&ch1<=122){
				arr[i]=(int)ch1-'a'+1;
				arr[i]-=key;
				if(arr[i]<=0){
					arr[i]+=26;
				}
				ch[i]=((char)(arr[i]+96));
			}
			String s=Character.toString(ch[i]);
			System.out.print(s);
		}
		System.out.print(last);
	}
}