package guvi3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PrimeHun {

	public static void main(String[] args) {
		ArrayList<Integer> prime=new ArrayList<Integer>();
		for(int i=2;i<100;i++) {
			int flag=0;
			for(int x=2;x<i/2;x++) {
				if(i%x==0) {
					flag=1;
					break;
				}
			}
			if(flag==0){
				prime.add(i);
			}
		}
		Set<Integer> sumPri=new TreeSet<Integer>();
		for(int k=0;k<prime.size();k++){
			int temp=prime.get(k);
			int sum=0;
				while(temp>0){
					sum+=temp%10;
					temp/=10;
				}
			int f=0;
			for(int x=2;x<sum/2;x++) {
				if(sum%x==0) {
					f=1;
					break;
				}
			}
			if(f==0){
				sumPri.add(sum);
			}
		}
		Iterator<Integer> it=sumPri.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}


