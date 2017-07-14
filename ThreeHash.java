package guvi2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThreeHash {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] string1=new String[n];
		String[] string2=new String[n]; 
		for(int i=0;i<n;i++){
			string1[i]=in.next();
			string2[i]=string1[i];
		}
		in.close();
		String[] string3=new String[n];
		for(int i=0;i<n;i++){
			string3[i]=string1[i].substring(0,3).toUpperCase();
		}
		Map<String,String> m= new HashMap<String,String>();
		for(int i=0;i<n;i++){
			m.put(string3[i], string1[i]);
		}
		System.out.println(m);
	}

}
