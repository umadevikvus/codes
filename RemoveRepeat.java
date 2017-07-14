package guvi2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveRepeat {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.next();
		in.close();
		char[] ch=string.toCharArray();
		Set<Character> s=new TreeSet<Character>();
		for(int i=0;i<ch.length;i++){
			s.add(ch[i]);
		}
		Iterator<Character> i=s.iterator();
		while(i.hasNext()){
			System.out.print(i.next());
		}
	}

}
