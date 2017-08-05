package guvi3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveRe {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		String string = in.next();
		in.close();
		char[] chr = string.toCharArray();
		Set<Character> r = new TreeSet<Character>();
		for( int i = 0 ; i < chr.length ; i++ ) {
			r.add( chr[i] );
		}
		Iterator<Character> i = r.iterator();
		while( i.hasNext() ) {
			System.out.print( i.next() );
		}
	}
}

