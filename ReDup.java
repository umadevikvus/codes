package guvi4;

import java.util.*;

public class ReDup {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		char[] letter=str.toCharArray();
		Set<Character> s=new TreeSet<Character>();
		for(int i=0;i<letter.length;i++) {
			s.add(letter[i]);
		}
		Iterator<Character> k=s.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
	}

}
