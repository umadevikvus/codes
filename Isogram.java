package guvi1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Isogram {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		in.close();
		int count=0;
		char[] ch=s.toCharArray();
		Set<Character> s1=new TreeSet<Character>();
		for(int i=0;i<ch.length;i++){
			s1.add(ch[i]);
		}
		Iterator<Character> i=s1.iterator();
		while(i.hasNext()){
			i.next();
		 	count++;
		}
		if(count==s.length()){
			System.out.println("isogram");
		}
		else{
			System.out.println("Not Isogram");
		}
	}

}
